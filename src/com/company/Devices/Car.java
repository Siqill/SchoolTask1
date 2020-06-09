package com.company.Devices;

import com.company.Creatures.Human;

public abstract class Car extends Device implements Comparable<Car> {

    String kolor;

    public abstract void reFuel();

    public void turnOn() {
        System.out.println("Car turns on");
    }

    public int compareTo(Car i) {
        return i.yearOfProduction - this.yearOfProduction;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(!seller.isCarInGarage(this)) {
            throw new Exception("no car in garage");
        }
        if(!buyer.isFreeSpaceInGarage()) {
            throw new Exception("no space in garage");
        }
        if(buyer.cash < price) {
            throw new Exception("no money too much");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash += price;
        buyer.cash -= price;
        System.out.println("Deal!");
    }

    public Double getValue() {
        return value;
    }

    public Car(String producer, String model, int yearOfProduction, Double value, String kolor) {
        super(producer, model, yearOfProduction, value);
        this.kolor = kolor;
    }

    public String toString() {
        return super.toString() + " " + this.kolor;
    }
}
