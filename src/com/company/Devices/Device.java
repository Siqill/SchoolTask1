package com.company.Devices;

public abstract class Device {

    public abstract void turnOn();

    public final String producer;
    public final String model;
    public final int yearOfProduction;

    public Device(String producer, String model, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return this.producer + " " + this.model + " " + yearOfProduction;
    }
}

