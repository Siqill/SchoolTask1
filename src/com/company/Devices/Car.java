package com.company.Devices;

public class Car {
    public final String producer;
    public final String model;
    public final boolean isElectric;
    String kolor;
    private Double value = 5000.0;

    public String toString() {
        return this.producer + " " + this.model;
    }

    public Double getValue() {
        return value;
    }


    public Car(String producer, String model, boolean isElectric, String kolor) {
        this.producer = producer;
        this.model = model;
        this.isElectric = isElectric;
        this.kolor = kolor;
    }
}
