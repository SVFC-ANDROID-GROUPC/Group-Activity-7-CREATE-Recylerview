package com.example.groupact5_androidgetterandsetter.employeepage;

public class Employee {
    private String name;
    private  String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public Employee() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
