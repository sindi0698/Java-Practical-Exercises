package com.practicalexercises2.ex4;

import java.util.ArrayList;

public class UserServiceImpl implements CrudService<User> {
    UserStorage userStorage = new UserStorage();

    @Override
    public User find(int id) throws ServiceException {
        return userStorage.find(id);
    }

    @Override
    public void save(User item) throws ServiceException {
        userStorage.save(item);
    }

    @Override
    public ArrayList<User> findAll() throws ServiceException {
        return userStorage.findAll();
    }

    @Override
    public void delete(int userId) throws ServiceException {
        userStorage.delete(userId);
    }
}
