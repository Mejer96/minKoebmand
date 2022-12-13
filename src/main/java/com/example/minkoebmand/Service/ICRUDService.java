package com.example.minkoebmand.Service;

import java.util.ArrayList;
import java.util.Optional;

public interface ICRUDService<T, ID> {
    ArrayList<T> findAll();
    T save(T object);
    void delete(T object);
    void deleteByID(ID id);
    Optional<T> findById();
}
