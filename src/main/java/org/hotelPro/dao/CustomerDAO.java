package org.hotelPro.dao;

import org.hotelPro.domain.Customer;
import org.hotelPro.domain.Room;
import org.hotelPro.mapper.CustomerMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CustomerDAO extends BaseDAO implements ICrud<Customer> {


    private final CustomerMapper customerMapper = new CustomerMapper();

    @Override
    public void insert(Customer obj) {

        try {
            PreparedStatement ps = conn.prepareStatement(SQLQueryConstant.INSERT_CUSTOMER);
            ps.setString(1, obj.getName());
            ps.setInt(2, obj.getPhoneNumber());
            ps.setString(3, obj.getEmail());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Customer> getAll() {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQLQueryConstant.GET_ALL_CUSTOMER);
            return customerMapper.resultSetToList(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Customer getById(Integer id) {
        return null;
    }



    @Override
    public void update(Room obj, Integer roomNo) {

    }

    @Override
    public void deleteById(Integer id) {

        try {
            PreparedStatement ps = conn.prepareStatement(SQLQueryConstant.DELETE_CUSTOMER);
            ps.setInt(1, id.intValue());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
