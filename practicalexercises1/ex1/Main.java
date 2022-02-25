package com.practicalexercises1.ex1;

public class Main {
    public static final double CONVERTIONRATE = 1.60934;
    public static void main(String[] args) {

        double miles = 10.00;
        double kilometers;
        System.out.println("\t  miles      kilometers");
        while (miles <= 110.00){
            kilometers = CONVERTIONRATE * miles;
            System.out.println(String.format("%10.2f",miles) + "      " + String.format("%10.2f",kilometers));
            miles += 10.00;
        }
    }
}
