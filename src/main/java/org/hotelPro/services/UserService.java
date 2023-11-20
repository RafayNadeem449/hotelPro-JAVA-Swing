package org.hotelPro.services;

import org.hotelPro.dao.UserDAO;
import org.hotelPro.domain.Room;
import org.hotelPro.domain.User;

import java.util.List;

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



    public String[][] getAllUserForJTable(){
        List<User> usersList = dao.getAll();
        return transformToJTable(usersList,5);
    }

    private String[][] transformToJTable(List<User> userList,int columnSize){
        String[][] data = new String[userList.size()][columnSize];

        for (int i = 0; i < userList.size() ; i++) {
            data[i][0] = String.valueOf(userList.get(i).getUser_name());
            data[i][1] = String.valueOf(userList.get(i).getUser_phoneNumber());
            data[i][2] = String.valueOf(userList.get(i).getUser_email());

        }

        return data;
    }

}



