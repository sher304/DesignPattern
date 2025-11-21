package org.example;

import org.example.Adapter.EmployeeAdapter;
import org.example.Adapter.ITarget;
import org.example.Factory.DataAnalyticsEngine;
import org.example.Factory.DatabaseFactory;
import org.example.Factory.DatabaseType;
import org.example.Observer.ConcreteObserver;
import org.example.Observer.Subject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            // MARK: Factory
//            dbEngines();
//            Thread.sleep(2000);
//            System.out.println();
//
//            // MARK: ADAPTER
//            employeesAdapterDemo();
//            Thread.sleep(2000);
//            System.out.println();

            // MARK: OBSERVER
            observingThings();
            Thread.sleep(2000);
            System.out.println();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void dbEngines() {
        var sqlEngine = new DataAnalyticsEngine(DatabaseFactory.createDatabase(DatabaseType.SqlServer));
        sqlEngine.processData("Query to process data for SQL Server");

        var oracleEngine = new DataAnalyticsEngine(DatabaseFactory.createDatabase(DatabaseType.Oracle));
        oracleEngine.processData("Query to process data for Oracle");
    };

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

    static void observingThings() throws InterruptedException {
        Subject RedMI = new Subject("Red MI Mobile", 10000, "Out Of Stock");

        ConcreteObserver user1 = new ConcreteObserver("Anurag");
        user1.addSubscriber(RedMI);

        ConcreteObserver user2 = new ConcreteObserver("Pranaya");
        user2.addSubscriber(RedMI);

        ConcreteObserver user3 = new ConcreteObserver("Priyanka");
        user3.addSubscriber(RedMI);

        Thread.sleep(1000);

        System.out.println("Red MI Mobile current state : " + RedMI.getAvailability());
        System.out.println();

        Thread.sleep(1000);

        user3.removeSubscriber(RedMI);

        Thread.sleep(1000);
        RedMI.setAvailability("Available");
    }

}