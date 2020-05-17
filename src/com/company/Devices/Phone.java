package com.company.Devices;

public class Phone extends Device{

    public void turnOn() {
        System.out.println("Phone turns on");
    }

    public final Double screenSize;
    public final boolean isAndroid;

    public Phone(String producer, String model, int yearOfProduction, Double screenSize, boolean isAndroid) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }

    public String toString() {
        return super.toString() + " " + this.screenSize + " " + this.isAndroid;
    }
}




