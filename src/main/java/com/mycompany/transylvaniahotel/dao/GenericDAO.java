package com.mycompany.transylvaniahotel.dao;
/**
 *
 * @author alfathrev
 */
import com.mycompany.transylvaniahotel.config.MongoManager;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.conversions.Bson;
import java.util.ArrayList;
import java.util.List;

public class GenericDAO<T> implements BaseDAO<T> {

    private final MongoCollection<T> collection;
    private final Class<T> clazz;

    public GenericDAO(String collectionName, Class<T> clazz) {
        this.clazz = clazz;
        // Menghubungkan ke koleksi di MongoDB
        this.collection = MongoManager.getDatabase().getCollection(collectionName, clazz);
    }

    @Override
    public void save(T entity) {
        // Logika untuk menyimpan data ke MongoDB
        collection.insertOne(entity);
    }

    @Override
    public T getById(String fieldName, Object value) {
        // Logika untuk mencari 1 data berdasarkan field tertentu (misal: uidRfid)
        return collection.find(Filters.eq(fieldName, value)).first();
    }

    @Override
    public List<T> getAll() {
        // Logika untuk mengambil semua data
        return collection.find().into(new ArrayList<>());
    }

    @Override
    public void delete(String fieldName, Object value) {
        // Logika untuk menghapus data
        collection.deleteOne(Filters.eq(fieldName, value));
    }

    @Override
    public List<T> getManyByPropertyRegex(String fieldName, String keyword) {

        Bson filter = Filters.regex(fieldName, ".*" + keyword + ".*", "i");
        return collection.find(filter).into(new ArrayList<>());
    }

    @Override
    public List<T> searchKaryawanMultiField(String keyword) {
        Bson filter = Filters.or(
                Filters.regex("username", ".*" + keyword + ".*", "i"),
                Filters.regex("namaKaryawan", ".*" + keyword + ".*", "i"),
                Filters.regex("jabatan", ".*" + keyword + ".*", "i")
        );
        return collection.find(filter).into(new ArrayList<>());
    }

    @Override
    public void update(String idFieldName, Object idValue, T entity) {
        // Logika untuk memperbarui data secara aman tanpa delete terlebih dahulu
        collection.replaceOne(Filters.eq(idFieldName, idValue), entity);
    }
}
