package com.practicalexercises2.ex4;
import java.util.ArrayList;

public interface CrudService<T>  {
    T find(int id) throws ServiceException;
    void save(T item) throws ServiceException;
    ArrayList<T> findAll() throws ServiceException;
    void delete(int id) throws ServiceException;
}
