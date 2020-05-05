package com.company.Devices;

public class Phone {
    public final String producer;
    public final String model;
    public final Double screenSize;
    public final boolean isAndroid;

    public String toString() {
        return this.producer + " " + this.model;
    }

    public Phone(String producer, String model, Double screenSize, boolean isAndroid) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }
}




