package com.codekul.brushup.javaconcepts;

import com.codekul.brushup.javaconcepts.abstractclasses.Animal;
import com.codekul.brushup.javaconcepts.abstractclasses.Tiger;
import com.codekul.brushup.javaconcepts.classesobjects.BuiltIn;
import com.codekul.brushup.javaconcepts.classesobjects.Wallet;
import com.codekul.brushup.javaconcepts.inheritance.Device;
import com.codekul.brushup.javaconcepts.inheritance.Mobile;
import com.codekul.brushup.javaconcepts.interfaces.Bike;
import com.codekul.brushup.javaconcepts.interfaces.Bird;

/**
 * Created by aniruddha on 20/12/16.
 */
public class Starter {

    public void classesAndObjects() {

        Wallet wallet = new Wallet();
        wallet.topUp(100);
        wallet.transferMoney("1234",50);
        System.out.printf("Wallet ballance is %d ",wallet.balance());
    }

    public void someBuiltInClasses() {

        BuiltIn builtIn = new BuiltIn();
        builtIn.builder();
        builtIn.stringOps();
    }

    public void inheritance() {

        Device device = new Device();
        device.makeDevice(10l,"India",50);

        Mobile mobile = new Mobile(10l,"India",50,false);
        mobile.mobileInfo();

        Device devMob = new Mobile(10l,"India",50,false);
    }

    public void abstractClass() {

        Animal animal = new Tiger();
        animal.walk();

        Tiger tiger = new Tiger();
        tiger.walk();

        allAnimals(animal);
        allAnimals(tiger);
    }

    public void interfaces() {

        Bike bike = new Bike();
        bike.speedingUp();
        System.out.printf("\n Location of bike is %s ",bike.gpsLocation());

        Bird bird = new Bird();
        bird.fly();
        System.out.printf("\n Location of bird is %s ",bird.gpsLocation());
    }

    public void allAnimals(Animal animal) {

    }
}
