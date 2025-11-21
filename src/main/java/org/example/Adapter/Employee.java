package org.example.Adapter;

public class Employee {

    public int ID;
    public String Name;
    public String Designation;
    public double Salary;

    public Employee(int ID, String name, String designation, double salary) {
        this.ID = ID;
        Name = name;
        Designation = designation;
        Salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}

