/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UserModel;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author vikas
 * 
 */
public class DBConnection {

    /**
     * 
     * @return Connection object
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://192.168.1.54:3306/test", "wsadmin", "worksmart");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        try {
            System.out.println("before con"+conn);
            conn.close();
            System.out.println("after"+conn);
            conn = null;         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
