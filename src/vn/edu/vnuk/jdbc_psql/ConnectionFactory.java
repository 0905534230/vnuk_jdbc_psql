package vn.edu.vnuk.jdbc_psql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		try {
			return DriverManager.getConnection(
					"jdbc:postgresql://localhost/vnuk_psql",
					"luyn",
					"quan"
			);		
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}