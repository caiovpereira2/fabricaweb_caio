package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/fabricaweb", "postgres","postgres");
		} catch (SQLException e) {
			
			//relancando a exception, DAO nao vai saber da exception
			throw new RuntimeException(e);
		}
	}

}