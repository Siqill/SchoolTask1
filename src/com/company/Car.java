package com.company;

public class Car {
    public final String producer;
    public final String model;
    public final boolean isElectric;
    String kolor;

    public Car(String producer, String model, boolean isElectric, String kolor) {
        this.producer = producer;
        this.model = model;
        this.isElectric = isElectric;
        this.kolor = kolor;
    }
}