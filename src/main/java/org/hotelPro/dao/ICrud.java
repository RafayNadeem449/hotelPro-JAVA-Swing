package org.hotelPro.dao;

import org.hotelPro.domain.Room;

import java.util.List;

public interface ICrud<T> {

    void insert(T obj);
    List<T> getAll();
    T getById(Integer id);


    void update(Room obj, Integer roomNo);

    void deleteById(Integer id);


}
