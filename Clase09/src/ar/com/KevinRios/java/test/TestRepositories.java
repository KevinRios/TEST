package ar.com.KevinRios.java.test;

import ar.com.KevinRios.java.connector.Connector;
import ar.com.KevinRios.java.entities.Curso;
import ar.com.KevinRios.java.repositories.CursoR;
import ar.com.KevinRios.java.repositories.I_CursoR;
import java.sql.Connection;

public class TestRepositories {
    public static void main(String[] args) {
        Connection conn = Connector.getConnection();
        I_CursoR cr = new CursoR(conn);
        Curso curso = new Curso("PHP", "Torres", "Viernes", "Noche");
        cr.save(curso);
        System.out.println(curso);
        
        // test ahora con el DAO 
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        //cr.getAll().forEach(System.out::println);
        cr.getByTitulo("java").forEach(System.out::println);
        
    }
}
