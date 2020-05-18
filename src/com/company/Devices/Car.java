package com.company.Devices;

import com.company.Creatures.Human;

public abstract class Car extends Device {

    String kolor;
    private Double value = 5000.0;

    public abstract void reFuel();

    public void turnOn() {
        System.out.println("Car turns on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getCar() == this && buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            buyer.setCar(this);
            seller.setCar(null);
            System.out.println("You just had a deal!");
            System.out.println(buyer + " now have " + buyer.getCar());
            System.out.println(seller + " now have no more " + buyer.getCar() );
            System.out.println(seller + " now have " + seller.cash);
            System.out.println(buyer + " now have " + buyer.cash);
        }
        else if (buyer.cash < price) {
            System.out.println(buyer + " do not have enough money");
        }
        else if (seller.getCar() != this) {
            System.out.println(seller + " do not have that car");
        }

    }

    public Double getValue() {
        return value;
    }

    public Car(String producer, String model, int yearOfProduction, String kolor) {
        super(producer, model, yearOfProduction);
        this.kolor = kolor;
    }

    public String toString() {
        return super.toString() + " " + this.kolor;
    }
}
