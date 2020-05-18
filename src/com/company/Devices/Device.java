package com.company.Devices;

import com.company.Saleable;

public abstract class Device implements Saleable {

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

