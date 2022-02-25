package com.practicalexercises1.ex4;

public class Main {
    public static void main(String[] args) {
        public static int height = 5;
        static int width = (2 * height) - 1;
        printA();
    }
    public static void printA(){
        int n = width / 2, i, j;
        for (i = 0; i < height; i++) {
            for (j = 0; j <= width; j++) {
                if (j == n || j == (width - n) || (i == height / 2 && j > n && j < (width - n)))
                    System.out.println("XXXX");
                else
                    System.out.println(" ");
            }
            System.out.println();
            n--;
        }
    }

}