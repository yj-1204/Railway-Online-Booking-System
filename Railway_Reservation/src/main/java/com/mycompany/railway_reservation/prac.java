/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.railway_reservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hp
 */
public class prac {
    public static void main(String[] args) {
         try {
        String url="jdbc:mysql://localhost:3306/";
        String dbname="piplani";
        String userName="root";
        String password="Vectors123";
        Connection connection=DriverManager.getConnection(url,userName,password);
        Statement statement=connection.createStatement();
        String sql="CREATE DATABASE "+dbname;
        statement.executeUpdate(sql);
        System.out.println("done");
        statement.close();
        System.out.println("hello");
        connection.close();
        System.out.println("database created");
    }
    catch (SQLException e){
         e.printStackTrace();
    }
    }
}
