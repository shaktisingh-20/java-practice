package com.shakti;

import java.util.ArrayList; // This imports the built-in Java class

public class ArrayListExamples {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(23);
        list.add(44);
        list.add(67);
        list.add(89);
        list.add(67);
        list.add(45);
        list.add(34);
        list.add(64);
        list.add(74);
        list.add(25);
        list.add(36);
        list.add(23);
        list.add(90);
        list.add(567);
        list.add(245);

        System.out.println(list);
    }
}