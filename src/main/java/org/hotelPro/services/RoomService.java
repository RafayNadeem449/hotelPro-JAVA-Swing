package org.hotelPro.services;

import org.hotelPro.dao.RoomDAO;
import org.hotelPro.domain.Room;

import java.util.List;

public class RoomService {


    RoomDAO dao = new RoomDAO();

    public void save(Integer room_no, String room_type, Integer room_price) {

        Room roomData = Room.builder()
                .room_no(room_no)
                .room_type(room_type)
                .room_price(room_price)
                .build();

        dao.insert(roomData);
    }


    public void DeleteRoomById(Integer id)
    {
        dao.deleteById(id);
    }


    public void EditRoomInfo(Integer room_no, String room_type, Integer room_price)
    {
        Room roomInfo = Room.builder()

                .room_type(room_type)
                .room_price(room_price)
                .build();

        dao.update(roomInfo, room_no);
    }

    public String[][] getAllRoomForJTable(){
        List<Room> roomList = dao.getAll();
        return transformToJTable(roomList,5);
    }

    private String[][] transformToJTable(List<Room> roomList,int columnSize){
        String[][] data = new String[roomList.size()][columnSize];

        for (int i = 0; i < roomList.size() ; i++) {
            data[i][0] = String.valueOf(roomList.get(i).getRoom_no());
            data[i][1] = roomList.get(i).getRoom_type();
            data[i][2] = String.valueOf(roomList.get(i).getRoom_price());
        }
        return data;
    }

}


