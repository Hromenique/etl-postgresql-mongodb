package teste.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexaoJDBC {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		ConectorJDBC conector = new ConectorJDBC();
		Connection conexao = conector.getConexao();
		String sql = "select * from curriculos";
		Statement statement = conexao.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		ResultSetMetaData metaData = resultSet.getMetaData();
		int cont = metaData.getColumnCount();

		while (resultSet.next()) {
			for (int i = 1; i <= cont; i++) {
				System.out.println(metaData.getColumnName(i) + "="
						+ resultSet.getString(i));
			}
			System.out.println("--------------------------------");
		}

	}

}
