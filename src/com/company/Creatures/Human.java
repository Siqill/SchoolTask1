package com.company.Creatures;

import com.company.Devices.Car;
import com.company.Devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    public FarmAnimal farmAnimal;
    public Phone phone;
    public Double cash;
    private Car car;

    public Human() {
        super("Homosapiens");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price){
        if(this instanceof Human) {
            System.out.println("No way");
        }
    }

    public void feed(){
        System.out.println("Tasty");
    }

    @Override
    public void feed(Double foodWeight) {

    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }

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

    public void setCar(Car car) {
        if(car.getValue() <= this.salary) {
            System.out.println("Congratulations! You just bought a new car!");
            this.car = car;
        }
        else if(car.getValue() <= this.salary * 12) {
            System.out.println("Nice! You just bought a new car in credit!");
            this.car = car;
        }
        else {
            System.out.println("Sorry, but you don't have enough money.");
        }

    }

    public Car getCar() {
        return car;
    }
}
