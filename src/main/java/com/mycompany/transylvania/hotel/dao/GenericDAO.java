package com.mycompany.transylvania.hotel.dao;

import java.util.List;

public class GenericDAO<T> implements BaseDAO<T> {
    private Class<T> type;

    public GenericDAO(Class<T> type) {
        this.type = type;
    }

    @Override
    public void save(T entity) {
        System.out.println("LOG: Berhasil menyimpan entitas " + type.getSimpleName());
    }

    @Override
    public T findById(String id) { return null; }

    @Override
    public List<T> findAll() { return null; }

    @Override
    public void update(T entity) {}

    @Override
    public void delete(String id) {}
}