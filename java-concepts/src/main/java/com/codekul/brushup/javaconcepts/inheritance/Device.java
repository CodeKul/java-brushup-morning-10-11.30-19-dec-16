package com.codekul.brushup.javaconcepts.inheritance;

/**
 * Created by aniruddha on 21/12/16.
 */
public class Device {

    private Long id;
    private String devBy;
    private int power;

    public void powerUp() {
        power += 5;
    }

    public String whoDeveloped() {
        return devBy;
    }

    public void makeDevice(Long id, String devBy, int power){
        this.id = id;
        this.devBy = devBy;
        this.power = power;
    }

    public int power() {
        return power;
    }

    public Long id() {
        return id;
    }

    public String devBy() {
        return devBy;
    }
}
