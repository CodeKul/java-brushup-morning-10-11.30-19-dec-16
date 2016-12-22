package com.codekul.brushup.javaconcepts.innerclassess;

/**
 * Created by aniruddha on 22/12/16.
 */
public class Outer {

    private int size;

    //inner classes
    private class PrivateInnerclass {

        private  int sizeInner;
        public void accessOuter() {
            size = 10;
        }
    }

    public class PublicInnerClass {

    }

    public static class StaticInner {

    }

    public void calc() {

        final class LocalInnerClass {

        }

        final LocalInnerClass localInner = new LocalInnerClass();
    }
}
