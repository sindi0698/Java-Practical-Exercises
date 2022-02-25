package com.practicalexercises1.ex4;

public class Main {
    public static void main(String[] args) {
        printTop();
        printBottom();
    }
    public static void printTop(){
        for(int row=1; row<=3; row++){
            for(int column=1; column<=16; column++){
                if((column>6 && column<11) && row==1){
                    System.out.print("X");
                }
                else if((column>4 && column<13) && row == 2){
                    System.out.print("X");
                }
                else if(((column>2 && column<7) && row == 3) || ((column>10 && column<15) && row == 3)){
                    System.out.print("X");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printBottom(){
        for(int row=1; row<=4; row++){
            for(int column=1; column<=16; column++){
                if(column<5 || column>12){
                    System.out.print("X");
                }
                else if(row == 2 && (column>=5 && column<=12)){
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
