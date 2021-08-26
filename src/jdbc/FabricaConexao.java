package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	public static Connection getConexao() {
		try {
			final String url = "jdbc:mysql://localhost:3306/curso_java";
			final String user = "root";
			final String password = "123456789";
			
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	//private static Properties getProperties() throws IOException {
	//	Properties prop = new Properties();
	//	String caminho = "/conexao.properties";
	//	prop.load(FabricaConexao.class.getResourceAsStream(caminho));
	//	return prop;
		
	//}
}
