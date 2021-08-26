package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		// Conex�o
		final String url = "jdbc:mysql://localhost:3306";
		final String user = "root";
		final String password = "123456789";
		
		Connection conexao = DriverManager.getConnection(url, user, password);
		
		// Criar banco
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco criado com sucesso");
		conexao.close();
		
	}
}
