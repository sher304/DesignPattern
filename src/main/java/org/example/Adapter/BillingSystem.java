package org.example.Adapter;

import java.util.List;

public class BillingSystem {

    public void processSalary(List<Employee> employeeList) {
        for(Employee employee: employeeList) {
            System.out.println("Rs." + employee.Salary + " Salary Credited to " + employee.Name + " Account");
        }
    }
}
