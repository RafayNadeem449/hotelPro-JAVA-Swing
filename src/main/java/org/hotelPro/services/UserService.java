package org.hotelPro.services;

import org.hotelPro.dao.UserDAO;
import org.hotelPro.domain.Room;
import org.hotelPro.domain.User;

public class UserService {


    UserDAO dao = new UserDAO();

    public void save(String userName, Integer phone, String email, String password) {

        User userData = User.builder()
                .user_name(userName)
                .user_phoneNumber(phone)
                .user_email(email)
                .userPassword(password)
                .build();

        dao.insert(userData);
    }

    public void deleteUserById(Integer id)
    {
        dao.deleteById(id);
    }
}
