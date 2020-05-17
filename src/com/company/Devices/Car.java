package com.company.Devices;

public class Car extends Device {

    public void turnOn() {
        System.out.println("Car turns on");
    }

    public final boolean isElectric;
    String kolor;

    private Double value = 5000.0;

    public Double getValue() {
        return value;
    }

    public Car(String producer, String model, int yearOfProduction, boolean isElectric, String kolor) {
        super(producer, model, yearOfProduction);
        this.isElectric = isElectric;
        this.kolor = kolor;
    }

    public String toString() {
        return super.toString() + " " + this.isElectric + " " + this.kolor;
    }
}
