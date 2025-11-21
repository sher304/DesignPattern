package org.example;

import org.example.Adapter.EmployeeAdapter;
import org.example.Adapter.ITarget;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        employeesAdapterDemo();
    }

    public static void employeesAdapterDemo() {
        String[][] employeesArray = {
                {"101", "John", "SE", "10000"},
                {"102", "Smith", "SE", "20000"},
                {"103", "Dev", "SSE", "30000"},
                {"104", "Pam", "SE", "40000"},
                {"105", "Sara", "SSE", "50000"}
        };
        for(int i = 0; i < employeesArray.length; i++){
            for(int k = 0; k < employeesArray[i].length; k++) {
                System.out.print(employeesArray[i][k]+" ");
            }
            System.out.println();
        }

        System.out.println("HR system passes employee string array to Adapter\n");
        ITarget target = new EmployeeAdapter();
        target.processCompanySalary(employeesArray);
    }
}