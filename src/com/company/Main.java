package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Doggi";

        Animal mouse = new Animal("mouse");
        mouse.name = "Mouse";

        dog.feed();
        dog.feed();

        mouse.feed();
        mouse.feed();
        mouse.feed();


        Human me = new Human();
        me.firstName = "Yahor";
        me.lastName = "Shauliuk";
        me.pet = dog;

        System.out.println(me.pet.name);
        System.out.println(me.firstName + " " + me.lastName);


    }
}
