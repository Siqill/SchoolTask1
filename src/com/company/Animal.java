package com.company;

import java.io.File;

public class Animal {
    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;

    final String species;
    String name;
    private Double weight = 10.0;

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
        weight += 0.1;
        System.out.println("thx for food. my weight is now " + this.weight);
    }

}
