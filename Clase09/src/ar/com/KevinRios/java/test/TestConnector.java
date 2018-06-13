package ar.com.KevinRios.java.test;

import ar.com.KevinRios.java.connector.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnector {

    public static void main(String[] args) throws Exception {
        Connection conn = Connector.getConnection();
        Statement stm = conn.createStatement();
        String query
                = "insert into cursos(titulo,profesor,dia,turno) " + "values ('Java','Rios','Lunes','Mañana')";
        stm.execute(query);

        /*
      execute() ejecuta una query insert/update/delete y devuelve tru
      si la query es del tipo select devuelve false
      
      executeUpdate() ejecuta una query insert/update/delete
      devuelve un entero con la cantidad de registros modificados
      
      executeQuery() ejecuta una query del tipo select
      devuelve un ResultSet con los registros obtenidos
      
         */
        Connector.getConnection().createStatement().execute(
                "insert into cursos (titulo,profesor,dia,turno) values"
                + "('html','gomez','martes','noche')"
        );

        ResultSet rs = Connector.getConnection().createStatement().executeQuery("select *from cursos");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + "\t"
                    + rs.getString("titulo") + "\t"
                    + rs.getString("profesor") + "\t"
                    + rs.getString("dia") + "\t"
                    + rs.getString("turno")
            );

        }
    }
}
