package org.hotelPro.dao;

import org.hotelPro.domain.Room;
import org.hotelPro.domain.User;
import org.hotelPro.mapper.IMapper;
import org.hotelPro.mapper.UserMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

        try {
            PreparedStatement ps = conn.prepareStatement(SQLQueryConstant.INSERT_USER);

            ps.setString(1, obj.getUser_name());
            ps.setInt(2, obj.getUser_phoneNumber());
            ps.setString(3, obj.getUser_email());
            ps.setString(4, obj.getUserPassword());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<User> getAll() {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQLQueryConstant.GET_USERS);
            return userMapper.resultSetToList(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User getById(Integer id) {
        return null;
    };


    @Override
    public void update(Room obj, Integer roomNo) {

    }

    @Override
    public void deleteById(Integer id) {
        try {
            PreparedStatement ps = conn.prepareStatement(SQLQueryConstant.DELETE_USER);
            ps.setInt(1, id.intValue());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
