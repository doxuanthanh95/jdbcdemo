package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private Connection conn;
	
	public static ConnectionUtil connectionUtil = new ConnectionUtil();
	public static ConnectionUtil getInstance(){
		return connectionUtil;
	}
	
	public ConnectionUtil(){
		this.initConnection();
	}
	public void initConnection(){
		
		try {
			this.conn = this.createMySQLConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getMyConnection(){
		return this.conn;
	}
	
	public Connection createMySQLConnection() throws ClassNotFoundException, SQLException {
		String hostName = "localhost";
		String database = "jdbcdemo";
		String userName = "root";
		String password = "";
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + database;
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;

	}
	
	public void returnMySQLConnection(){
		try {
			if(this.conn.isClosed()){
				this.conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
