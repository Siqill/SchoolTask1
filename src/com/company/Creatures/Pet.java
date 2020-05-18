package com.company.Creatures;

public class Pet extends Animal {
    public String name;

    public static final Double DEFAULT_FOOD_WEIGHT = 0.2;

    public Pet(String species, String name) {
        super(species);
        this.name = name;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.pet == this && buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = this;
            seller.pet = null;
            System.out.println("You just had a deal!");
            System.out.println(buyer + " now have " + buyer.pet);
            System.out.println(seller + " now have no more " + buyer.pet);
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

    @Override
    public void feed(Double foodWeight) {
        feed(DEFAULT_FOOD_WEIGHT);
    }
}
