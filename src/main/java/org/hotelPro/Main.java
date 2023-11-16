package org.hotelPro;


import org.hotelPro.dao.BaseDAO;
import org.hotelPro.dao.CustomerDAO;
import org.hotelPro.domain.Customer;
import org.hotelPro.ui.LoginUI;

import java.util.List;

public class Main {
    public static void main(String[] args) {

      new LoginUI();


//        CustomerDAO dao = new CustomerDAO();
//
//        List<Customer> customerList = dao.getAll();
//
//        for(Customer data : customerList)
//        {
//            System.out.println("ID   Name    Phone No  Email");
//            System.out.println(data);
//        }

    }
}