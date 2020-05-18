package com.company;

public interface Saleable {
    public abstract void sell(Human seller, Human buyer, Double price) throws Exception;
}
