package com.practicalexercises2.ex4;
import java.util.ArrayList;

public class DepartmentServiceImpl implements CrudService<Department>{

    DepartmentStorage departmentStorage = new DepartmentStorage();

    @Override
    public Department find(int id) throws ServiceException {
        return departmentStorage.find(id);
    }

    @Override
    public void save(Department item) throws ServiceException {
        departmentStorage.save(item);
    }

    @Override
    public ArrayList<Department> findAll() throws ServiceException {
        return departmentStorage.findAll();
    }

    @Override
    public void delete(int id) throws ServiceException {
        departmentStorage.delete(id);
    }
}
