package ar.com.KevinRios.java.repositories;

import ar.com.KevinRios.java.entities.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CursoR implements I_CursoR {

    private Connection conn;

    public CursoR(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void save(Curso curso) {
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "insert into cursos(titulo,profesor,dia,turno) values(?,?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS
            );

            ps.setString(1, curso.getTitulo());
            ps.setString(2, curso.getProfesor());
            ps.setString(3, curso.getDia());
            ps.setString(4, curso.getTurno());
            ps.execute();
            // como es un selec uso result set
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                // asigno el id obtenido y se lo mando a curso
                curso.setId(rs.getInt(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void remove(Curso curso) {
        if(curso== null){
            return;
        }
        
        try {
            conn.createStatement().execute(
                    "delete from cursos where id="+curso.getId()
            );
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public void update(Curso curso) {
       if(curso==null){
           return;
       }
       
        try {
             PreparedStatement ps = conn.prepareStatement(
                    "update cursos set titulo=?, profesor=?, dia=?, turno=?) where id=?"                    
            );

            ps.setString(1, curso.getTitulo());
            ps.setString(2, curso.getProfesor());
            ps.setString(3, curso.getDia());
            ps.setString(4, curso.getTurno());
            ps.setInt(5, curso.getId());
            ps.execute();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                curso.setId(rs.getInt(1));
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
       
    }

    // Clase para uso interno, por eso no va en la Interface
    private List<Curso> getByFiltro(String filtro) {
        List<Curso> lista = new ArrayList();
        try {
            ResultSet rs = conn.prepareStatement("select * from cursos where " + filtro).executeQuery();
            while (rs.next()) {
                lista.add(new Curso(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("profesor"),
                        rs.getString("dia"),
                        rs.getString("turno")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public Curso getById(int id) {
        List<Curso> lista = getByFiltro("id=" + id);
        return (lista.isEmpty()) ? null : lista.get(0);
    }

    @Override
    public List<Curso> getAll() {
        return getByFiltro("1=1");
    }

    @Override
    public List<Curso> getByTitulo(String titulo) {
        return getByFiltro("titulo='" + titulo + "'");
    }

    @Override
    public List<Curso> getLikeTitulo(String titulo) {
        return getByFiltro("titulo like'%='" + titulo + "%'");
    }

    @Override
    public List<Curso> getByProfesor(String profesor) {
        return getByFiltro("profesor='" + profesor + "'");
    }

    @Override
    public List<Curso> getLikeProfesor(String profesor) {
        return getByFiltro("profesor like'%='" + profesor + "%'");
    }

    @Override
    public List<Curso> getByDia(String dia) {
        return getByFiltro("dia='" + dia + "'");

    }

    @Override
    public List<Curso> getByTurno(String turno) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Curso> getLikeTituloProfesorDiaTurno(String titulo, String profesor, String dia, String turno) {

        String filtro = 
                 "titulo like '%"+titulo+"%' and "
                +"profesor like '%"+profesor+"%' and "
                +"dia like '%"+dia+"%' and "
                +"turno like '%"+turno+"%'";
        return getByFiltro(filtro);
    }

}
