package com.company;

import com.company.Devices.Car;
import com.company.Devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Doggi";

        Animal mouse = new Animal("mouse");
        mouse.name = "Mouse";

        Car audi = new Car("Audi", "R8", 2016, true, "black");

        Phone lg = new Phone("LG", "G8", 2015, 7.5, true);

        Human me = new Human();
        me.firstName = "Yahor";
        me.lastName = "Shauliuk";
        me.pet = dog;
        me.phone = lg;

        me.setSalary(1500.0);

        System.out.println("I earned " + me.getSalary() + " this month");

        me.setCar(audi);
        System.out.println(me.getCar().producer + " " + me.getCar().model);

        System.out.println(me.toString());
        System.out.println(audi.toString());
        System.out.println(lg.toString());
        lg.turnOn();
        audi.turnOn();

    }
}
