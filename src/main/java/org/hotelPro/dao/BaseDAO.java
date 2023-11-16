package org.hotelPro.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {
    final String DB_URL = "jdbc:mysql://localhost:3306/hotelDB";
    final String USER = "";
    final String PASS = "";
    Connection conn;

    BaseDAO(){
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
