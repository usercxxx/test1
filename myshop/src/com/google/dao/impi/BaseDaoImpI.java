package com.google.dao.impi;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.HikariConfig;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class BaseDaoImpI {
    protected static DataSource dataSource = null;

    static {
        Properties properties = new Properties();
        try {
            properties.load(BaseDaoImpI.class.getClassLoader().getResourceAsStream("hikari.properties"));
            // 连接数据库

        } catch (IOException e) {
            e.printStackTrace();
        }

         HikariConfig hikari = new HikariConfig(properties);
            dataSource  = new HikariDataSource(hikari);

    }
    protected Connection getconnection(){
        Connection connection = null;
        try {

            connection = BaseDaoImpI.dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  connection;
    }

    protected void closeAll(Connection connection ,Statement statement,ResultSet res){
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (statement!=null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }if (res!=null){
            try {
                res.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
