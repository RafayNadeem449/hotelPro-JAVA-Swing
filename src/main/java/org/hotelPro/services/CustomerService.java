package org.hotelPro.services;

import org.hotelPro.dao.CustomerDAO;
import org.hotelPro.domain.Customer;

import java.util.List;

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


    public String[][] getAllCustomerForJTable(){
        List<Customer> customerList = dao.getAll();
        return transformToJTable(customerList,5);
    }

    private String[][] transformToJTable(List<Customer> customerList, int columnSize){
        String[][] data = new String[customerList.size()][columnSize];


        for (int i = 0; i < customerList.size() ; i++) {
            data[i][0] = String.valueOf(customerList.get(i).getCustomer_id());
            data[i][1] = String.valueOf(customerList.get(i).getName());
            data[i][2] = customerList.get(i).getEmail();
            data[i][3] = String.valueOf(customerList.get(i).getPhoneNumber());
        }
        return data;
    }


}
