package com.company;

import com.company.Creatures.Animal;
import com.company.Creatures.FarmAnimal;
import com.company.Creatures.Human;
import com.company.Creatures.Pet;
import com.company.Devices.Car;
import com.company.Devices.Phone;

public class Main {

    public static void main(String[] args) {

        Pet dog = new Pet("dog","Doggi");
        FarmAnimal pig = new FarmAnimal("pig");

        Car audi = new Car("Audi", "R8", 2016, true, "black");

        Phone lg = new Phone("LG", "G8", 2015, 7.5, true);

        Human me = new Human();
        Human jimmy = new Human();
        Human son = new Human();

        me.firstName = "Yagor";
        me.lastName = "Shauliuk";
        jimmy.firstName = "Jimmy";
        jimmy.lastName = "Tudeski";
        son.firstName = "Jackie";
        son.lastName = "Chan";

        me.cash = 5000.0;
        me.pet = dog;
        me.farmAnimal = pig;
        me.phone = lg;

        jimmy.cash = 2000.0;

        me.setSalary(1500.0);

        System.out.println("I earned " + me.getSalary() + " this month");

        me.setCar(audi);
        System.out.println(me.getCar().producer + " " + me.getCar().model);

        System.out.println(me.toString());
        System.out.println(audi.toString());
        System.out.println(lg.toString());
        lg.turnOn();
        audi.turnOn();


        me.pet.sell(me, jimmy, 500.0);
        me.phone.sell(me, jimmy, 1000.0);
        me.getCar().sell(me, jimmy, 2500.0);
        son.sell(me, jimmy, 100000.0);
        pig.beEaten();
        pig.feed();
        me.feed();
        dog.feed(0.5);


    }
}
