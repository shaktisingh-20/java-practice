package com.shakti;

import java.util.ArrayList;
import java.util.Scanner;

public class inputArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }
        System.out.println(list);
    }
}
