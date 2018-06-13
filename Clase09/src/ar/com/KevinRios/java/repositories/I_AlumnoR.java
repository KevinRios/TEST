package ar.com.KevinRios.java.repositories;

import ar.com.KevinRios.java.entities.Alumno;
import ar.com.KevinRios.java.entities.Curso;
import java.util.List;

public interface I_AlumnoR {

void save(Alumno alumno);
void remove(Alumno alumno);
void update(Alumno alumno);

Alumno getBytId(int id);
List<Alumno> getAll();
List<Alumno> getByApellido(String apellido);
List<Alumno> getLikeApellido(String apellido);

List<Alumno> getByNombre(String nombre);
List<Alumno> getByApellidoNombre(String apellido,String nombre);

List<Alumno> getByCurso(Curso curso);
List<Alumno> getByCurso(int idCurso);




    
}
