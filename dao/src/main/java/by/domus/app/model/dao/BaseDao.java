package by.domus.app.model.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

    public T add(T t);
    public T get(Long id);
    public T update(T t);
    public void delete(Long id);
    public List<T> getAll();

}
