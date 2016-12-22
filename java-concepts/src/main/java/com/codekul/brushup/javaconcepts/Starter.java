package com.codekul.brushup.javaconcepts;

import com.codekul.brushup.javaconcepts.abstractclasses.Animal;
import com.codekul.brushup.javaconcepts.abstractclasses.Tiger;
import com.codekul.brushup.javaconcepts.classesobjects.BuiltIn;
import com.codekul.brushup.javaconcepts.classesobjects.Wallet;
import com.codekul.brushup.javaconcepts.inheritance.Device;
import com.codekul.brushup.javaconcepts.inheritance.Mobile;
import com.codekul.brushup.javaconcepts.innerclassess.Outer;
import com.codekul.brushup.javaconcepts.interfaces.Bike;
import com.codekul.brushup.javaconcepts.interfaces.Bird;
import com.codekul.brushup.javaconcepts.interfaces.GpsListener;

import javax.swing.*;
import java.awt.event.ActionEvent;

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

    public void allGpsEnabledEntities(GpsListener listener){
        if(listener instanceof Bird){
            Bird bird = (Bird) listener;
        }
        else {
            Bike bike = (Bike) listener;
        }
    }

    private void innerClasses() {

        Outer outer = new Outer();
        outer.calc();


        Outer.PublicInnerClass publicInner = outer.new PublicInnerClass();

        Outer.StaticInner staticInner = new Outer.StaticInner();


        /*
        * right hand side would be object of that class
        *  which is implementing GpsListener
        ***/

        GpsListener listener1 = new GpsListener() {
            @Override
            public String gpsLocation() {
                return null;
            }
        };

        allGpsEnabledEntities(listener1);
        allGpsEnabledEntities(new Bike());
        allGpsEnabledEntities(new Bird());
        allGpsEnabledEntities(() -> {
                return null;
            }
        );

        allGpsEnabledEntities(() -> "hello");
        allGpsEnabledEntities(this::anyAbc); //functional

        GpsListener listenerMethod = this::anyAbc;

        JButton btnOkay = new JButton("Okay");
        btnOkay.addActionListener(e -> System.out.printf("hello"));
        btnOkay.addActionListener(this::event);

        /*
        * right hand side would be object of that class
        *  which is implementing GpsListener but with no name
        ***/

    }

    private void event(ActionEvent actionEvent) {
    }

    public String anyAbc() {
        return "hello";
    }

    public void threading() {

        final class MyThread extends Thread {

            @Override
            public void run() {
                super.run();

                for (int i = 0; i < 100; i++) {
                    System.out.printf("\n MyThread is %d",i);
                }
            }
        }

        final MyThread t = new MyThread();
        t.start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.printf("\n Runnable is %d",i);
            }
        }).start();

    }
}
