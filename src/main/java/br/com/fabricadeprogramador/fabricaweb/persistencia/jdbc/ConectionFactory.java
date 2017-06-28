package br.com.fabricadeprogramador.fabricaweb.persistencia.jdbc;

import java.sql.*;

public class ConectionFactory {
	
	
	public static Connection getConnection(){
/*
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/fabricaweb", "postgres", "postgres");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
}
