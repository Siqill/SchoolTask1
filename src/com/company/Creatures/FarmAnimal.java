package com.company.Creatures;

public class FarmAnimal extends Animal implements Eatable {

    public static final Double DEFAULT_FOOD_WEIGHT = 0.3;

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("FarmAnimal is eaten");

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.farmAnimal == this && buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            buyer.farmAnimal = this;
            seller.farmAnimal = null;
            System.out.println("You just had a deal!");
            System.out.println(buyer + " now have " + buyer.farmAnimal);
            System.out.println(seller + " now have no more " + buyer.farmAnimal);
            System.out.println(seller + " now have " + seller.cash);
            System.out.println(buyer + " now have " + buyer.cash);
        }
        else if (buyer.cash < price) {
            System.out.println(buyer + " do not have enough money");
        }
        else if (seller.farmAnimal != this) {
            System.out.println(seller + " do not have that farmAnimal");
        }
    }

    @Override
    public void feed() {
        System.out.println("Yummy!!");

    }

    @Override
    public void feed(Double foodWeight) {
        feed(DEFAULT_FOOD_WEIGHT);
    }
}
