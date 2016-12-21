package com.codekul.brushup.javaconcepts.inheritance;

/**
 * Created by aniruddha on 21/12/16.
 */
public class Mobile extends Device {

    private Boolean isQwerty;

    public Mobile(Long id, String devBy, int power, Boolean isQwerty){
        super.makeDevice(id,devBy,power);
        this.isQwerty = isQwerty;
    }
    @Override
    public void powerUp() {
        super.powerUp();

        System.out.printf("Mobile Power has been up to %d", power());
    }

    public void mobileInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n Id - ").append(id())
                .append("\n Dev By - ").append(devBy())
                .append("\n Power - ").append(power())
                .append("\n Qwerty - ").append(isQwerty);

        System.out.printf("\n %s",builder.toString());
    }
}
