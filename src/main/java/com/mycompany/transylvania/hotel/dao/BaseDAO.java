package com.mycompany.transylvania.hotel.dao;

import java.util.List;

public interface BaseDAO<T> {
    void save(T entity);         
    T findById(String id);       
    List<T> findAll();           
    void update(T entity);       
    void delete(String id);      
}