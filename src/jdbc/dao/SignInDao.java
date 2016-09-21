package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import jdbc.util.ConnectionUtil;

public class SignInDao {
	
	/*public static boolean getUserFromDB(String userId, String password){
		ConnectionUtil connUtil = ConnectionUtil.getInstance();
		String sql = "SELECT userid, password FROM useraccount WHERE userid='"+userId+"' AND password='"+password+"'";
		Connection conn = connUtil.getMyConnection();
		try {
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()){
				connUtil.returnMySQLConnection();
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			connUtil.returnMySQLConnection();
			e.printStackTrace();
		}
		
		return false;
	}*/
	
	public static boolean getUserFromDB(String userId, String password){
		ConnectionUtil connUtil = ConnectionUtil.getInstance();
		//String sql = "SELECT userid, password FROM useraccount WHERE userid='"+userId+"' AND password='"+password+"'";
		String sql = "SELECT userid, password FROM useraccount WHERE userid=? AND password=?";
		Connection conn = connUtil.getMyConnection();
		try {
			//Statement statement = conn.createStatement();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, userId);
			pstm.setString(2, password);
			//ResultSet rs = statement.executeQuery(sql);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()){
				//userAccount = new UserAccountDto(rs.getString("userid"), rs.getString("password"));
				
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			connUtil.returnMySQLConnection();
		}
		
		return false;
	}
}
