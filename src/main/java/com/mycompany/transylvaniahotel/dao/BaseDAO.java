package com.mycompany.transylvaniahotel.dao;
/**
 *
 * @author alfathrev
 */
import java.util.List;

public interface BaseDAO<T> {

    void save(T entity);
    
    void update(String idFieldName, Object idValue, T entity);

    T getById(String fieldName, Object value);

    List<T> getAll();

    void delete(String fieldName, Object value);

    List<T> getManyByPropertyRegex(String fieldName, String keyword);
    
    List<T> searchKaryawanMultiField(String keyword);
}
