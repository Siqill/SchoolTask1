package com.company.Devices;

import com.company.Creatures.Human;

public class LPG extends Car {

    public LPG(String producer, String model, int yearOfProduction, Double value, String kolor) {
        super(producer, model, yearOfProduction, value, kolor);
    }

    public String toString() {
        return super.producer + " " + super.model + " " + super.yearOfProduction + " " + super.kolor;
    }

    @Override
    public void reFuel() {
        System.out.println("Your tank is full. Go ahead!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }

    @Override
    public int compareTo(Car car) {
        return 0;
    }
}
