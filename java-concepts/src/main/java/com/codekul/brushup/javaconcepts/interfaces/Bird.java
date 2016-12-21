package com.codekul.brushup.javaconcepts.interfaces;

/**
 * Created by aniruddha on 21/12/16.
 */
public class Bird implements GpsListener{

   public void fly() {

   }

    @Override
    public String gpsLocation() {
        return "FLY";
    }
}
