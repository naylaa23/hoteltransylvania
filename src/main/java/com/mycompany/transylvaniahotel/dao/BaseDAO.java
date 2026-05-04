package com.mycompany.transylvaniahotel.dao;

import java.util.List;
import org.bson.conversions.Bson;

public interface BaseDAO<T> {
    // Operasi CRUD Dasar sesuai Standar Sprint 2 [cite: 1206]
    void save(T entity);
    void update(Bson filter, T entity);        
    void delete(Bson filter); 
    
    // Operasi Reading/Searching [cite: 1211]
    List<T> findAll();                
    T findOne(Bson filter);        // Ganti dari findById ke findOne agar matching [cite: 1213]
    List<T> findMany(Bson filter);                
}