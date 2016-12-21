package com.codekul.brushup.javaconcepts.classesobjects;

/**
 * Created by aniruddha on 21/12/16.
 */
public class BuiltIn {

    private String name;
    private StringBuilder builder;

    public void stringOps() {

        //name = new String("Android");
        name = "Android";
        System.out.printf("\n Name is %s",name);
        System.out.printf("\n Uppercase is %s",name.toUpperCase());
        System.out.printf("\n Character at oth is %c",name.charAt(0));
    }

    public void builder() {

        String builderStr = "codekul.com";

        builder = new StringBuilder();
        builder.append(builderStr.charAt(0))
                .append(12220)
                .append(true)
                .append(15.0f);

        System.out.printf("\n Builder Created %s ",builder.toString());
    }
}
