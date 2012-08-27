package teste.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorJDBC {
	
	private Connection connection;
	
	public ConectorJDBC() throws ClassNotFoundException, SQLException{
		criarConexao();
	}
	
	private void criarConexao() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		this.connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/curriculo_lattes_2","postgres","12345");
	}
	
	public Connection getConexao(){
		return this.connection;
	}
	
}
