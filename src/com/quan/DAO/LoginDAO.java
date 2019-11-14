package com.quan.DAO;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class LoginDAO {
	String sql = "select *from hibernate where id = ? and color = ?";
	String  url = "jdbc:mysql//localhost:3306/hibernate";
	String username = "root";
	String password = "123456";
	public boolean check(int id, String color) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = (Connection) DriverManager.getConnection(url, username, password);
		PreparedStatement createStatement = (PreparedStatement) connection.prepareStatement(sql);
		createStatement.setInt(1, id);
		createStatement.setString(2, color);
		ResultSet executeQuery = createStatement.executeQuery();
		while(executeQuery.next()) {
			return  true;
		}
		return false;
	}

}
