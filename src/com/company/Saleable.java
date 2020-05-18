package com.company;

import com.company.Creatures.Human;

public interface Saleable {
    public abstract void sell(Human seller, Human buyer, Double price);
}
