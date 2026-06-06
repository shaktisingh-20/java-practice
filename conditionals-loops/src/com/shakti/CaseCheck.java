package com.shakti;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character:=> ");
        char ch = sc.next().trim().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }else{
            System.out.println("UPPERCASE");
        }
    }
}
