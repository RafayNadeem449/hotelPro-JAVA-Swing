package org.hotelPro.mapper;

import org.hotelPro.domain.Room;
import org.hotelPro.mapper.IMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomMapper implements IMapper<Room> {

    @Override
    public List<Room> resultSetToList(ResultSet rs) throws SQLException {
        List<Room> customerList = new ArrayList<>();
        while (rs.next()){
            Room room = Room.builder()
                    .room_id(rs.getInt("room_id"))
                    .room_no(rs.getInt("room_no"))
                    .room_type(rs.getString("room_type"))
                    .room_price(rs.getInt("room_price"))
                    .build();
            customerList.add(room);
        }
        return customerList;
    }

    @Override
    public Room resultSetToObject(ResultSet rs) throws SQLException {
        if(rs.next()){
            return Room.builder()
                    .room_id(rs.getInt("room_id"))
                    .room_no(rs.getInt("room_no"))
                    .room_type(rs.getString("room_type"))
                    .room_price(rs.getInt("room_price"))
                    .build();
        }
        return null;
    }
}
