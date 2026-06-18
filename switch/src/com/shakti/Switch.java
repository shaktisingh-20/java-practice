package com.shakti;

import java.util.Scanner;

public class Switch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

//        switch (fruit){
//            case "Mango":
//                System.out.println("king of fruits");
//                break;
//            case "Apple":
//                System.out.println("Red Juicy fruit");
//                break;
//            case "orange":
//                System.out.println("cirle shape fruit");
//            case "grape":
//                System.out.println("small fruit");
//            default:
//                System.out.println("please enter valid fruit");
//        }
//        switch (fruit){
//            case "Mango"  -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("Red juicy fruit");
//            case "orange" -> System.out.println("Circle shape");
//            case "grape" -> System.out.println("Small fruit");
//        }
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }

}
