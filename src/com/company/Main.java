package com.company;

import com.company.Creatures.Animal;
import com.company.Creatures.FarmAnimal;
import com.company.Creatures.Human;
import com.company.Creatures.Pet;
import com.company.Devices.Car;
import com.company.Devices.Disel;
import com.company.Devices.Electric;
import com.company.Devices.Phone;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        Pet dog = new Pet("dog","Doggi");
        FarmAnimal pig = new FarmAnimal("pig");

        Car audi = new Electric("Audi", "R8", 2016, "black");
        Car bmw = new Disel("BMW", "I8", 2019, "white");

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
        me.setCar(audi);
        son.setCar(bmw);

        jimmy.cash = 2000.0;

        lg.installAnApp("Facebook");
        lg.installAnApp("Instagram", "5.24");
        lg.installAnApp("Spotify", "1.2", "google.play/spotify");
        try {
            lg.installAnApp(new URL("https", "google.play/", "Spotify"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        me.getCar().reFuel();
        son.getCar().reFuel();


    }
}
