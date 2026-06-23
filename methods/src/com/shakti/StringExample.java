package com.shakti;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String naam = sc.next();
        String personalised = message(naam);
        System.out.println(personalised);
    }

    static String message(String name){
      String msg = "Hello" + " " + name;
      return msg;
    };

    static String greet(){
        String greeting = "hello how are you";
        return greeting;
    };
}
