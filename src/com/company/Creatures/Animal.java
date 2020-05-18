package com.company.Creatures;

import com.company.Saleable;

import java.io.File;

public abstract class Animal implements Saleable, Feedable {
    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;

    public final String species;
    private Double weight = 10.0;

    public String toString() {
        return this.species;
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

    public void feed() {
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
