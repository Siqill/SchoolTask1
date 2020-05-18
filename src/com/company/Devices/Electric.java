package com.company.Devices;

public class Electric extends Car {

    public Electric(String producer, String model, int yearOfProduction, String kolor) {
        super(producer, model, yearOfProduction, kolor);
    }

    public String toString() {
        return super.producer + " " + super.model + " " + super.yearOfProduction + " " + super.kolor;
    }

    @Override
    public void reFuel() {
        System.out.println("Your car battery is full. Go ahead!");
    }
}
