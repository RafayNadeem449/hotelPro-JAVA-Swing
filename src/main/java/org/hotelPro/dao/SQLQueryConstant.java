package org.hotelPro.dao;

public class SQLQueryConstant {


    public final static String GET_ALL_CUSTOMER = "select * from Customer";

    public final static String CHECK_AUTH = "SELECT * from User WHERE user_email = ? AND user_password = ?";

    public final static String INSERT_ROOM = "INSERT INTO Room(room_no,room_type,room_price) VALUES (?,?,?);";


    public final static String DELETE_ROOM = "DELETE FROM ROOM WHERE room_id = ?";

    public final static String UPDATE_ROOM_INFO = "UPDATE Room SET room_type = ? , room_price = ? WHERE room_no = ?;";

    public final static String INSERT_USER = "INSERT INTO User(user_name,user_phone,user_email,user_password) VALUES (?,?,?,?);";

    public final static String DELETE_USER = "DELETE FROM User WHERE user_id = ?";


    public final static String INSERT_CUSTOMER = "INSERT INTO Customer(customer_name,c_phone,c_email) VALUES (?,?,?);";

    public final static String DELETE_CUSTOMER = "DELETE FROM Customer WHERE customer_id = ?";

    public final static String GET_ROOMS = "SELECT * FROM Room";

    public final static String GET_USERS = "SELECT * FROM User";



}
