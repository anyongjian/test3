package net.codejava.springmvc.test;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class JdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数据库链接
		Connection connection = null;
		//预编译的Statement,使用预编译的Statement提高数据库性能
		PreparedStatement preparedStatement = null;
		//结果集
		ResultSet resultSet = null;
		try{
			//加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			//通过驱动管理类获取数据库链接
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ayj?characterEncoding=utf-8","root","");
			String sql = "select* from user where name = ?";
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			preparedStatement.setString(1, "xiaoan");
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				//System.out.println(resultSet.getString("name"));//resultSet.getString("name")+" "+resultSet.getString(resultSet.getString("password"))
				System.out.println(resultSet.getString("name")+" "+resultSet.getString("password"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(resultSet!=null){
				try {
					resultSet.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if(preparedStatement!=null){
				try {
					preparedStatement.close();
				} catch (Exception e3) {
					// TODO: handle exception
					e3.printStackTrace();
				}
			}
			if(connection!=null){
				try {
					connection.close();
				} catch (Exception e4) {
					// TODO: handle exception
					e4.printStackTrace();
				}
			}
		}
	}

}
