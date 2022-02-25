package com.practicalexercises2.ex3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws EmptyListException, NullItemException {
        try{
            List<Employee> theEmployeesList = new ArrayList<Employee>();

            Employee firstEmployee = new Employee("Sindi", "Dhima", 23, 15.00);
            Employee secondEmployee = new Employee("Keidi", "Gjika", 22, 12.00);
            Employee thirdEmployee = new Employee("Grasjela", "Qyli", 21, 16.00);

            theEmployeesList.add(firstEmployee);
            theEmployeesList.add(secondEmployee);
            theEmployeesList.add(thirdEmployee);

            List<Manager> theManagersList = new ArrayList<Manager>();
            Manager firstManager = new Manager("Andi", "Muka", 35, 20.00);
            Manager secondManager = new Manager("Jona", "Borishi", 28, 20.00);

            theManagersList.add(firstManager);
            theManagersList.add(secondManager);

            EmployeeDataMapper employeeDataMapper = new EmployeeDataMapper();
            employeeDataMapper.map(theEmployeesList, firstManager);
            System.out.println("Mapping succeeded...!");
            employeeDataMapper.reverseMap(secondEmployee, theManagersList);
            System.out.println("Reverse Mapping succeeded...!");

            //Printing for testing purpose
//            System.out.println("Map employee list to manager: ");
//            System.out.println(employeeDataMapper.map(theEmployeesList, firstManager).toString());
//            System.out.println("Map manager list to employee: Reverse operation: ");
//            System.out.println(employeeDataMapper.reverseMap(secondEmployee, theManagersList).toString());

        }catch (EmptyListException | NullItemException customException){
            System.out.println("Exception occured: "+ customException);
            System.out.println("Mapping/Reverse Mapping failed...!");
        }
    }
}
