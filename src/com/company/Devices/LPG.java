package com.company.Devices;

public class LPG extends Car {

    public LPG(String producer, String model, int yearOfProduction, String kolor) {
        super(producer, model, yearOfProduction, kolor);
    }

    public String toString() {
        return super.producer + " " + super.model + " " + super.yearOfProduction + " " + super.kolor;
    }

    @Override
    public void reFuel() {
        System.out.println("Your tank is full. Go ahead!");
    }

}
