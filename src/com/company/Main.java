package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Doggi";

        Animal mouse = new Animal("mouse");
        mouse.name = "Mouse";


        Human me = new Human();
        me.firstName = "Yahor";
        me.lastName = "Shauliuk";
        me.pet = dog;

        System.out.println(me.pet.name);
        System.out.println(me.firstName + " " + me.lastName);

        dog.feed();
        dog.feed();
        dog.takeForAWalk();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();



    }
}
