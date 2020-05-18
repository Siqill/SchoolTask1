package com.company.Devices;

import com.company.Human;

public class Car extends Device {

    public void turnOn() {
        System.out.println("Car turns on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
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
