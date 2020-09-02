package com.javaDesignPattern.facadePattern.demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 本例使用外观模式模拟JDBC连接数据库：连接，返回结果集，关闭连接；
 */
public class JDBCByFacade {
    private Connection connection = null;
    private Statement statement = null;
    //注册数据库驱动，并连接
    public void getConnection(String driver,String url,String username,String password){
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //获取结果集
    public ResultSet executeQuery(String sql){
        try {
            return statement.executeQuery(sql);
        }catch (Exception e){
            return null;
        }
    }

    //关闭连接
    public void close(){
        try {
            statement.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
