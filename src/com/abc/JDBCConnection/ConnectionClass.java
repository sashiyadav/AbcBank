/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

<<<<<<< HEAD
=======

>>>>>>> d1609686539caf6b7fc11a70dbf3102fa9a58ccd
/**
 *
 * @author test
*/ 
public class ConnectionClass {
<<<<<<< HEAD
    public static Connection getConnected() throws ClassNotFoundException, SQLException{


    //public static Connection getConnected() throws ClassNotFoundException, SQLException{

=======
>>>>>>> d1609686539caf6b7fc11a70dbf3102fa9a58ccd

    public static Connection getConnected() throws ClassNotFoundException, SQLException{

<<<<<<< HEAD
    //static public Connection getConnected() throws ClassNotFoundException, SQLException{



    //static public Connection getConnected() throws ClassNotFoundException, SQLException{
=======
    Class.forName("oracle.jdbc.driver.OracleDriver");
>>>>>>> d1609686539caf6b7fc11a70dbf3102fa9a58ccd

        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        String userName="mainuser";
        String pass="password";
        Connection connect=DriverManager.getConnection(url,userName,pass);
        return connect;
    }
}
