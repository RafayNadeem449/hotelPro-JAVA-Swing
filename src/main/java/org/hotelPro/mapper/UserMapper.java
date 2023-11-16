package org.hotelPro.mapper;

import org.hotelPro.domain.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserMapper implements IMapper<User>{

    @Override
    public List<User> resultSetToList(ResultSet rs) throws SQLException {
        return null;
    }

    @Override
    public User resultSetToObject(ResultSet rs) throws SQLException {
        if(rs.next()) {
            return User.builder()
                    .user_id(rs.getInt("user_id"))
                    .user_name(rs.getString("user_name"))
                    .user_phoneNumber(rs.getInt("user_phone"))
                    .user_email(rs.getString("user_email"))
                    .userPassword(rs.getString("user_password"))
                    .build();
        }
        return null;
    }
}
