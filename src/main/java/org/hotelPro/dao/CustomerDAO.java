package org.hotelPro.dao;

import org.hotelPro.domain.Customer;
import org.hotelPro.mapper.CustomerMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CustomerDAO extends BaseDAO {


    private final CustomerMapper customerMapper = new CustomerMapper();

    public List<Customer> getAll() {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQLQueryConstant.GET_ALL_CUSTOMER);
            return customerMapper.resultSetToList(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
