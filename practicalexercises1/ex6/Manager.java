package com.practicalexercises1.ex6;

public class Manager extends Person{
    private int salary;

    public Manager(){}
    public Manager(int id, String name, String surname, int age, String email, int workHours) {
        super(id, name, surname, age, email, workHours);
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int calculateManagerSalary() throws NegativeHoursException{
            int managerTotalSalary = SalaryConstants.MANAGER_BASIC_SALARY;
            int overtimeHours = this.getWorkHours() - 200;
            if(overtimeHours < 0) {
                throw new NegativeHoursException("This amount of work hours for the manager is not valid!");
            }
            else{
                int overTimePayment = overtimeHours * (SalaryConstants.MANAGER_PAYMENT_OVERTIME_HOUR);
                managerTotalSalary += overTimePayment;
            }
        return managerTotalSalary;
    }
}
