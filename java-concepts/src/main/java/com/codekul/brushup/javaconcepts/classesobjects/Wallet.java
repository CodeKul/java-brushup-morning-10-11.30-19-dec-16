package com.codekul.brushup.javaconcepts.classesobjects;

/**
 * Created by aniruddha on 20/12/16.
 */
public class Wallet {

    private int amt; //state
    private String idNum;

    public void topUp(int amt) {
        this.amt += amt;
    }

    public void transferMoney(String toId, int amt){ // behaviour
        this.amt -= amt;
    }

    public int balance(){
        return amt;
    }
}
