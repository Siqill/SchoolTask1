package com.company.Devices;

import com.company.Creatures.Human;

public class Phone extends Device {

    public void turnOn() {
        System.out.println("Phone turns on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == this && buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            buyer.phone = this;
            seller.phone = null;
            System.out.println("You just had a deal!");
            System.out.println(buyer + " now have " + buyer.phone);
            System.out.println(seller + " now have no more " + buyer.phone);
            System.out.println(seller + " now have " + seller.cash);
            System.out.println(buyer + " now have " + buyer.cash);
        } else if (buyer.cash < price) {
            System.out.println(buyer + " do not have enough money");
        } else if (seller.phone != this) {
            System.out.println(seller + " do not have that phone");
        }
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




