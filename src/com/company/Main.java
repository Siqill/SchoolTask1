package com.company;

import com.company.Creatures.FarmAnimal;
import com.company.Creatures.Human;
import com.company.Creatures.Pet;
import com.company.Devices.*;


public class Main {

    public static void main(String[] args) {

        Pet dog = new Pet("dog","Doggi");
        FarmAnimal pig = new FarmAnimal("pig");

        Car audi = new Electric("Audi", "R8", 2016, 5000.0,"black");
        Car bmw = new Disel("BMW", "I8", 2019, 3000.0,"white");

        Phone lg = new Phone("LG", "G8", 2015, 700.0,7.5, true);

        Human me = new Human(3);
        Human jimmy = new Human(3);

        me.firstName = "Yahor";
        me.cash = 50000.0;
        me.pet = dog;
        me.farmAnimal = pig;
        me.phone = lg;
        me.setCar(audi, 0);
        me.setCar(bmw, 1);

        jimmy.firstName = "Jimmy";
        jimmy.cash = 20000.0;


        try {
            audi.sell(me, jimmy, 5000.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(me.cash);
        System.out.println(jimmy.cash);
        System.out.println(me.getCar(0));
        System.out.println(me.carsSumValue());

        Transaction first = new Transaction(me, jimmy, 100.0, "26.06.2020");
        Transaction second = new Transaction(jimmy, me, 250.0, "06.05.2020");

        audi.listOfTransactions.add(first);
        bmw.listOfTransactions.add(second);

        System.out.println(audi.wasOwner(me));
        System.out.println(audi.wasSold(jimmy, me));
        System.out.println(audi.numOfTransactions());



    }
}
