package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Doggi";

        Animal mouse = new Animal("mouse");
        mouse.name = "Mouse";

        Car audi = new Car("Audi", "R8", false, "black");

        Human me = new Human();
        me.firstName = "Yahor";
        me.lastName = "Shauliuk";
        me.pet = dog;
        me.car = audi;

        me.setSalary(1500.0);

        System.out.println("I earned " + me.getSalary() + " this month");
    }
}
