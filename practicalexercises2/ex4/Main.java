package com.practicalexercises2.ex4;

public class Main {

    public static void main(String[] args) throws ServiceException {

        UserServiceImpl userService = new UserServiceImpl();
        DepartmentServiceImpl departmentService = new DepartmentServiceImpl();

        System.out.println(userService.findAll());

        User newTestUser = new User( "Grasjela", "Qyli", 22, AppConstants.TRAINEE);
        userService.save(newTestUser);
        System.out.println(userService.findAll());

        userService.delete(newTestUser.getId());
        System.out.println(userService.findAll());

        userService.delete(100);

        Department newTestDepartment = new Department( "DevTeam Test", 8);
        departmentService.save(newTestDepartment);
        System.out.println(departmentService.findAll());

        departmentService.delete(newTestDepartment.getId());
        System.out.println(departmentService.findAll());
    }
}
