package com.company;

import java.io.File;

public class Animal implements Saleable {
    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        if(this instanceof Human) {
            throw  new Exception("Don't do this");
        }
        if(seller.pet == this && buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = this;
            seller.pet = null;
            System.out.println("You just had a deal!");
            System.out.println(buyer + " now have " + buyer.pet.name);
            System.out.println(seller + " now have no more " + buyer.pet.name );
            System.out.println(seller + " now have " + seller.cash);
            System.out.println(buyer + " now have " + buyer.cash);
        }
        else if (buyer.cash < price) {
            System.out.println(buyer + " do not have enough money");
        }
        else if (seller.pet != this) {
            System.out.println(seller + " do not have that pet");
        }
    }

    final String species;
    String name;
    private Double weight = 10.0;

    public String toString() {
        return this.species + " " + this.name;
    }

    File pic;

    public Animal(String species) {
        this.species = species;

        if (species == "lion") {
            this.weight = DEFAULT_LION_WEIGHT;
        }
        else if (species == "mouse") {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        }
        else if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        }
    }

    void feed() {
        if (weight >= 20.0) {
            System.out.println("Your pet is too fat. Dead!");
        }
        else if(weight == 0) {
            System.out.println("too late!");
        }
        else {
            weight++;
            System.out.println("thx for food!!! My weight is " + this.weight + " now");
        }
    }

    void takeForAWalk() {
        if (weight == 0) {
            System.out.println("Your pet is dead");
        }
        else if (weight >= 20.0) {
            System.out.println("Your pet is too fat. Dead!");
        }
        else {
            weight--;
            System.out.println("Thx for a walk!!! My weight is " + this.weight + " now");
        }

    }

}
