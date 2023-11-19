package org.hotelPro.dao;

import org.hotelPro.domain.Room;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class BaseDAO {
    final String DB_URL = "jdbc:mysql://localhost:3306/hotelDB";
    final String USER = "root";
    final String PASS = "";
    Connection conn;

    BaseDAO(){
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public abstract void update(Room obj, Integer roomNo);

    public abstract void deleteById(Integer id);
}
