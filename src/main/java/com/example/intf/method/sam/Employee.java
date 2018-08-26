package com.example.intf.method.sam;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        System.out.println(" name :" + name);
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void getEmployeDis() {
        System.out.println(" name :" + name  + "\n salary:" + salary);
    }
}
