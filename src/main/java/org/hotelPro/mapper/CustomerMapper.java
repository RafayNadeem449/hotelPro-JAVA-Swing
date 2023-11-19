package org.hotelPro.mapper;

import org.hotelPro.domain.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerMapper implements IMapper<Customer> {


    public List<Customer> resultSetToList(ResultSet rs) throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        while (rs.next()){
            Customer customer = Customer.builder()
                    .customer_id(rs.getInt("customer_id"))
                    .name(rs.getString("customer_name"))
                    .phoneNumber(rs.getInt("c_phone"))
                    .email(rs.getString("c_email"))
                    .build();
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public Customer resultSetToObject(ResultSet rs) throws SQLException {
        if(rs.next()){
            return   Customer.builder()
                    .customer_id(rs.getInt("customer_id"))
                    .name(rs.getString("customer_name"))
                    .phoneNumber(rs.getInt("c_phone"))
                    .email(rs.getString("c_email"))
                    .build();
        }
        return null;
    }
}
