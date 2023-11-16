package org.hotelPro.dao;

public class SQLQueryConstant {


    public final static String GET_ALL_CUSTOMER = "select * from Customer";

    public final static String CHECK_AUTH = "SELECT * from User WHERE user_email = ? AND user_password = ?";


}
