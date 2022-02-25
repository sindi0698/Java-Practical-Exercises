package com.practicalexercises1.ex6;
public class Employee extends Person{

    public Employee(){}
    public Employee(int id, String name, String surname, int age, String email, int workHours) {
        super(id, name, surname, age, email, workHours);
    }
    public int calculateEmployeeSalary() throws NegativeHoursException{
        int employeeTotalSalary = SalaryConstants.EMPLOYEE_BASIC_SALARY;
        int overtimeHours = this.getWorkHours() - 200;
        if(overtimeHours < 0) {
            throw new NegativeHoursException("This negative overtime hour for the Employee is not valid!");
        }
        else{
            int overTimePayment = overtimeHours * (SalaryConstants.EMPLOYEE_PAYMENT_OVERTIME_HOUR);
            employeeTotalSalary += overTimePayment;
        }
        return employeeTotalSalary;
    }
}
