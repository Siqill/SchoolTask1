package com.company.Devices;

import com.company.Saleable;

public abstract class Device implements Saleable {

    public abstract void turnOn();

    public final String producer;
    public final String model;
    public final int yearOfProduction;
    public Double value;

    public Device(String producer, String model, int yearOfProduction, Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    public String toString() {
        return this.producer + " " + this.model + " " + yearOfProduction;
    }

}

