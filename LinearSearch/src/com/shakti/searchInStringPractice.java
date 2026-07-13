package com.shakti;

import java.util.Arrays;

public class searchInStringPractice {
    public static void main(String[] args) {
        String str = "Shakti";
        char target = 'k';
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(findMin(str,target));

    }
    static boolean findMin (String name, char target){
        if (name.length() == 0) {
            return false;
        }
        for (int index = 0; index < name.length(); index++) {
            if (target == name.charAt(index)) {
                return true;
            }
        }
        return false;
    }
}
