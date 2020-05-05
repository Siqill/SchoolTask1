package com.company;

import com.company.Devices.Car;
import com.company.Devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Doggi";

        Animal mouse = new Animal("mouse");
        mouse.name = "Mouse";

        Car audi = new Car("Audi", "R8", false, "black");
        Car audi1 = new Car("Audi", "R8", false, "black");
        Car bmw = new Car("BMW", "I8", true, "blue");

        Phone phone = new Phone("LG", "G8", 7.0, true);
        Human me = new Human();
        me.firstName = "Yahor";
        me.lastName = "Shauliuk";
        me.pet = dog;
        me.phone = phone;

        me.setSalary(1500.0);

        System.out.println("I earned " + me.getSalary() + " this month");

        me.setCar(audi);
        System.out.println(me.getCar().producer + " " + me.getCar().model);

        System.out.println((audi).equals(bmw));
        System.out.println((audi).equals(audi1)); //wyrzuca false
        System.out.println(dog);
        System.out.println(audi);
        System.out.println(audi1);
        System.out.println(me.toString());
        System.out.println(audi.toString());
        System.out.println(dog.toString());
        System.out.println(phone.toString());
    }
}
