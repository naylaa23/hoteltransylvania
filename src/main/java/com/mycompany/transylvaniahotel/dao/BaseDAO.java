package com.mycompany.transylvaniahotel.dao;

import java.util.List;

public interface BaseDAO<T> {
    void save(T entity);
    T getById(String fieldName, Object value);
    List<T> getAll();
    void delete(String fieldName, Object value);
}