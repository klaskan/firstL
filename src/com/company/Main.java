package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }

        ArrayList<TestKlasse> elever = new ArrayList<>();
        elever.add(new TestKlasse("Klas", 10));
        elever.add(new TestKlasse("Ine", 15));

        System.out.println(elever.get(0).getNavn());;





    }
}
