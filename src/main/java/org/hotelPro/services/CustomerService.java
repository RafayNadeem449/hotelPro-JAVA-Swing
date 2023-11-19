package org.hotelPro.services;

import org.hotelPro.dao.CustomerDAO;
import org.hotelPro.domain.Customer;
import org.hotelPro.domain.Room;

public class CustomerService {


    CustomerDAO dao = new CustomerDAO();


    public void save(String cName, Integer c_phone, String c_email) {

        Customer CustomerData = Customer.builder()
                .name(cName)
                .phoneNumber(c_phone)
                .email(c_email)
                .build();

        dao.insert(CustomerData);
    }



    public void DeleteCustomerById(Integer id)
    {
        dao.deleteById(id);
    }
}
