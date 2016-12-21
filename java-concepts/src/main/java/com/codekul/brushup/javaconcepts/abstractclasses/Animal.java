package com.codekul.brushup.javaconcepts.abstractclasses;

/**
 * Created by aniruddha on 21/12/16.
 */
public abstract class Animal {

    private Integer healthFactor;
    private Integer legs;

    public Animal(){
        this.healthFactor = 50;
        this.legs = 4;
    }

    public Animal(Integer healthFactor, Integer legs){
        this.healthFactor = healthFactor;
        this.legs = legs;
    }

    public abstract void walk() ;

    public Boolean isHealthy(){
        return healthFactor > 50;
    }
}
