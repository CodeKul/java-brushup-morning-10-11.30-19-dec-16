package com.codekul.brushup.javaconcepts.collections;

import java.util.*;

/**
 * Created by aniruddha on 26/12/16.
 */
public class MyCollection {

    public void simpleCollection() {

        Collection<String> collection = new ArrayList<>();
        collection.add("Android");
        collection.add("iOS");
        collection.add("RIM");
        collection.add("Symbian");
        collection.add("Palm");
        collection.add("WebOs");
        collection.add("Bada");

        collection.remove("Bada");

        iterateUsingIterator(collection);
        iterateUsingForEachOld(collection);
    }

    public void iterateUsingIterator(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String el = iterator.next();
            System.out.printf("\n Iterator Element - %s", el);
        }
    }

    public void iterateUsingForEachOld(Collection<String> collection){
        for (String s : collection) {
            System.out.printf("\n Foreach Element - %s",s);
        }
    }

    public void iterateJava8ForEach(Collection<String> collection) {
        collection.forEach(s -> System.out.printf("java8 - %s",s));
        collection.forEach(this::display);
    }

    private void display(String s){
        System.out.printf("\n java8 - %s",s);
    }

    private void whatIsMap() {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Android");
        map.put(2,"iOS");
        map.put(3,"RIM");
        map.put(4,"Palm");
        map.put(5,"Symbian");

        Set<Integer> keys = map.keySet();

        Collection<String> values = map.values();

        Set<Map.Entry<Integer,String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.printf("Key %d value %s", entry.getKey(), entry.getValue());
        }

        entries.forEach( entry -> System.out.printf("Key %d value %s", entry.getKey(), entry.getValue()));

        map.forEach((key,value) -> System.out.printf("Key %d value %s", key, value));
    }
}
