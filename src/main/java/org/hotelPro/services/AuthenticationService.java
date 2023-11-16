package org.hotelPro.services;

import org.hotelPro.dao.UserDAO;
import org.hotelPro.domain.User;

import java.sql.SQLException;

public class AuthenticationService {


    public Boolean checkLogin(String email, Integer Password) throws SQLException {
        UserDAO userDAO = new UserDAO();

        User user = userDAO.getEmailAndPassword(email,Password);

        if(user!=null)
        {
            return Boolean.TRUE;
        }
        else
        {
            return Boolean.FALSE;
        }

    }

}
