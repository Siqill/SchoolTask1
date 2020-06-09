package com.company.Devices;

import com.company.Creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {

    public static final String SERVER_ADRESS = "1.101.010.01";
    public static final String PROTOCOL = "https:";
    public static final String APP_NAME = "Instagram";

    public void installAnApp(String appName) {
        System.out.println("You install " + appName);
    }

    public void installAnApp(String appName, String version) {
        System.out.println("You install " + appName + " with version " + version);
    }

    public void installAnApp(String appName, String version, String serverAdress) {
        System.out.println("You install " + appName + " with version " + version + " from " + serverAdress);
    }

    public void installAnApp(String[] appNames) {
        for (String appName : appNames) {
            installAnApp(appName);
        }
    }

    public void installAnApp(URL appURL) throws MalformedURLException {
        System.out.println("You install app from " + appURL);
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == this && buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            buyer.phone = this;
            seller.phone = null;
            System.out.println("You just had a deal!");
            System.out.println(buyer + " now have " + buyer.phone);
            System.out.println(seller + " now have no more " + buyer.phone);
            System.out.println(seller + " now have " + seller.cash);
            System.out.println(buyer + " now have " + buyer.cash);
        } else if (buyer.cash < price) {
            System.out.println(buyer + " do not have enough money");
        } else if (seller.phone != this) {
            System.out.println(seller + " do not have that phone");
        }
    }


    public final Double screenSize;
    public final boolean isAndroid;

    public Phone(String producer, String model, int yearOfProduction, Double value, Double screenSize, boolean isAndroid) {
        super(producer, model, yearOfProduction, value);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }

    public String toString() {
        return super.toString() + " " + this.screenSize + " " + this.isAndroid;
    }
}




