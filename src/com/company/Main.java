package com.company;
import java.util.Hashtable;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String>friends = new Hashtable<Integer, String>();

        friends.put(1, "Assyl");
        friends.put(2, "Aisha");
        friends.put(3, "Dias");
        friends.put(4, "Bekzat");

        for (Integer itm: friends.keySet()) {
            System.out.println(itm+ " " + friends.get(itm));
        }

        String value = friends.get(3);
        System.out.println("Found friend`s name is: " + value);
    }
}
