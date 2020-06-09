package com.company.Devices;

import com.company.Creatures.Human;


import java.util.ArrayList;

public abstract class Car extends Device implements Comparable<Car> {

    String kolor;

    public ArrayList<Transaction> listOfTransactions = new ArrayList<Transaction>();

    public boolean wasOwner(Human owner) {
        if(owner == this.listOfTransactions.get(0).buyer) {
            return true;
        }
        for(Transaction listOfTransactions : this.listOfTransactions) {
            if(owner == listOfTransactions.seller) {
                return true;
            }
        }
        return false;
    }

    public boolean wasSold(Human seller, Human buyer) {
        for(Transaction listOfTransactions : this.listOfTransactions) {
            if(seller == listOfTransactions.seller && buyer == listOfTransactions.buyer) {
                return true;
            }
        }
        return false;
    }

    public int numOfTransactions() {
        return this.listOfTransactions.size();
    }


    public int compareTo(Car i) {
        return i.yearOfProduction - this.yearOfProduction;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(!seller.isCarInGarage(this)) {
            throw new Exception("no car in garage");
        }
        if(!buyer.isFreeSpaceInGarage()) {
            throw new Exception("no space in garage");
        }
        if(buyer.cash < price) {
            throw new Exception("no money too much");
        }
        if(this.listOfTransactions.get(this.listOfTransactions.size() - 1).buyer != seller) {
            throw new Exception("you are not an owner of that car");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash += price;
        buyer.cash -= price;
        this.listOfTransactions.add(new Transaction(seller, buyer, price,"05.06.2020"));
        System.out.println("Deal!");
    }

    public Double getValue() {
        return value;
    }

    public Car(String producer, String model, int yearOfProduction, Double value, String kolor) {
        super(producer, model, yearOfProduction, value);
        this.kolor = kolor;
    }

    public String toString() {
        return super.toString() + " " + this.kolor;
    }
}
