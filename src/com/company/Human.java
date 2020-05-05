package com.company;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Phone phone;
    Car car;

    private Double salary = 2000.0;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary < 0) {
            System.out.println("Your salary must be higher than 0! Set another amount.");
        }
        else if (salary != 2000.0) {
            System.out.println("ZUS and US already know! Do not lie!");
        }
        System.out.println("Data has been sent to accounting system");
        System.out.println("You must pick up an annex from Ms. Hani!!!");
        this.salary = salary;
    }
}
