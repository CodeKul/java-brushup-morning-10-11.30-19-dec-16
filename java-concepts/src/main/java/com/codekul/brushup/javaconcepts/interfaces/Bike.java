package com.codekul.brushup.javaconcepts.interfaces;

/**
 * Created by aniruddha on 21/12/16.
 */
public class Bike implements GpsListener{

    public void speedingUp(){

    }

    @Override
    public String gpsLocation() {
        return "ROAD";
    }
}
