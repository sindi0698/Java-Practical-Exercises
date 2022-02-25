package com.practicalexercises1.ex2;

import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter a number to reverse: ");
        if (input.hasNextInt()) {
            int inputInserted = input.nextInt();
            System.out.println("Number reversed: " + reverseInteger(inputInserted));
        } else {
            String inputInserted = input.nextLine();
            System.out.println("String reversed: " + reverseString(inputInserted));
        }
    }
    public static int reverseInteger(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int reminder = number % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            number /= 10;
        }
        return reversedNumber;
    }
   public static StringBuilder reverseString(String word) {
       StringBuilder stringToReverse = new StringBuilder(word);
       return stringToReverse.reverse();
   }
}


