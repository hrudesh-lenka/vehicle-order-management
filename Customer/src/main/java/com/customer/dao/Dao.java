package com.customer.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    List<T> getAll();
    Optional<T> get(long id);
    T save(T t);
    T update(T t);
    void delete(long id);
}
