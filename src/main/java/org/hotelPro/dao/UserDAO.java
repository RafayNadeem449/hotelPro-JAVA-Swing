package org.hotelPro.dao;

import org.hotelPro.domain.User;
import org.hotelPro.mapper.IMapper;
import org.hotelPro.mapper.UserMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDAO extends BaseDAO implements ICrud<User>{

    IMapper<User> userMapper = new UserMapper();


    public User getEmailAndPassword(String email, Integer password) throws SQLException {
        try {
            PreparedStatement ps = conn.prepareStatement(SQLQueryConstant.CHECK_AUTH);
            ps.setString(1,email);
            ps.setInt(2,password);

            ResultSet rs = ps.executeQuery();

            return userMapper.resultSetToObject(rs);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void insert(User obj) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public void update(User obj, Long id) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
