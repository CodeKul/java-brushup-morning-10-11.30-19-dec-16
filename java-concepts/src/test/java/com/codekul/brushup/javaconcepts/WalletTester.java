package com.codekul.brushup.javaconcepts;

import com.codekul.brushup.javaconcepts.classesobjects.Wallet;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aniruddha on 20/12/16.
 */
public class WalletTester {

    @Test
    public void checkBalance(){

        Wallet wallet = new Wallet();
        wallet.topUp(100);
        wallet.transferMoney("1234",50);
        Assert.assertEquals(wallet.balance(), 50);
    }
}
