package org.hotelPro.dao;

import org.hotelPro.domain.Room;
import org.hotelPro.mapper.RoomMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class RoomDAO extends BaseDAO implements ICrud<Room> {

    RoomMapper roomMapper = new RoomMapper();
    @Override
    public void insert(Room obj) {
        try {
            PreparedStatement ps = conn.prepareStatement(SQLQueryConstant.INSERT_ROOM);
            ps.setInt(1, obj.getRoom_no());
            ps.setString(2, obj.getRoom_type());
            ps.setInt(3, obj.getRoom_price());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Room> getAll() {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQLQueryConstant.GET_ROOMS);
            return roomMapper.resultSetToList(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Room getById(Integer id) {
        return null;
    }


    @Override
    public void update(Room obj, Integer roomNo) {

        try {
            PreparedStatement ps = conn.prepareStatement(SQLQueryConstant.UPDATE_ROOM_INFO);
            ps.setString(1, obj.getRoom_type());
            ps.setInt(2, obj.getRoom_price());
            ps.setInt(3, roomNo.intValue());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public void deleteById(Integer id) {

        try {
            PreparedStatement ps = conn.prepareStatement(SQLQueryConstant.DELETE_ROOM);
            ps.setInt(1, id.intValue());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
