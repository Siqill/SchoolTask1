package com.company.Creatures;

import com.company.Devices.Car;
import com.company.Devices.Phone;
import java.util.Arrays;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    public FarmAnimal farmAnimal;
    public Phone phone;
    public Double cash;
    private Car[] garage;


    public static final Double DEFAULT_FOOD_WEIGHT = 0.5;
    public static final int DEFAULT_GARAGE_SIZE = 2;

    public Human() {
        super("Homosapiens");
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(int garageSize) {
        super("Homosapiens");
        this.garage = new Car[garageSize];
    }

    public Double carsSumValue(){
        Double sum = 0.0;
        for (Car car : this.garage) {
            if(car != null) {
                sum += car.value;
            }
        }
        return sum;
    }

    public void sortCarsByYear() {
        Arrays.sort(garage);
    }

    public boolean isCarInGarage(Car newCar) {
        for (Car car : garage) {
            if(car == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean isFreeSpaceInGarage() {
        for(Car car : garage) {
            if(car == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car newCar) {
        for (int i = 0; i < garage.length; i++) {
            if (this.garage[i] == newCar) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car newCar) {
        for(int i = 0; i < garage.length; i++) {
            if(this.garage[i] == null) {
                this.garage[i] = newCar;
                break;
            }
        }
    }


    @Override
    public void sell(Human seller, Human buyer, Double price){
        if(this instanceof Human) {
            System.out.println("No way");
        }
    }

    @Override
    public void feed(Double foodWeight) {
        feed(DEFAULT_FOOD_WEIGHT);
    }

    public void setCar(Car car, int index) {
        if(car.getValue() <= this.cash) {
            System.out.println("Congratulations! You just bought a new car!");
            this.garage[index] = car;
        }
        else if(car.getValue() <= this.cash * 12) {
            System.out.println("Nice! You just bought a new car in credit!");
            this.garage[index] = car;
        }
        else {
            System.out.println("Sorry, but you don't have enough money.");
        }

    }

    public Car getCar(int index) {
        return garage[index];
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}
