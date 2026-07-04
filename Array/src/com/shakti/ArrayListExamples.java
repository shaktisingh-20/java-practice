package com.shakti;

import java.util.ArrayList; // This imports the built-in Java class

public class ArrayListExamples {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(23);
        list.add(44);
        list.add(23);
        list.add(90);
        list.add(567);
        list.add(245);

        System.out.println(list);
        list.set(0, 87);
        list.remove(3);
        System.out.println(list);

    }
}