package com.practicalexercises2.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;


public class DepartmentStorage {

    ArrayList<Department> d;
    ArrayList<Department> departmentsList = new ArrayList<>(Arrays.asList(
            new Department ("Dev Team 1", 3 ),
            new Department( "Dev Team 2", 5),
            new Department("Dev Team 3", 2)
    ));

    public void save(Department newDepartment){
        departmentsList.add(newDepartment);
    }

    public ArrayList<Department> findAll() throws ServiceException{
      return departmentsList;
    }
    public Department find(int id){
        Optional<Department> foundDepartment =  departmentsList.stream().filter(department -> department.getId() == id).findFirst();
        return foundDepartment.orElse(null);
    }

    public void delete(int id){
        Department departmentToBeDeleted = find(id);
        try{
            if(departmentToBeDeleted == null){
                throw new ServiceException("This department is null, so it can't be deleted!");
            }
            departmentsList.remove(departmentToBeDeleted);
        } catch (ServiceException e){
            System.out.println("Exception occured: " + e);
        }
    }
}
