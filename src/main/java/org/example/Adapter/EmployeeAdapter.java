package org.example.Adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter implements ITarget {
    private final BillingSystem thirdPartyBillingSystem = new BillingSystem();
    @Override
    public void processCompanySalary(String[][] employeeList) {
        List<Employee> employees = new ArrayList<>();
        for(int i = 0; i < employeeList.length; i++){
            int id = Integer.parseInt(employeeList[i][0]);
            String name = employeeList[i][1];
            String designation = employeeList[i][2];
            double salary = Double.parseDouble(employeeList[i][3]);
            employees.add(new Employee(id, name,designation,salary));
        }
        thirdPartyBillingSystem.processSalary(employees);
    }
}
