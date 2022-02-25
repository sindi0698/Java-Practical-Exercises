package com.practicalexercises1.ex5;

import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the degree to convert: ");
        double degree = input.nextDouble();
        if(degree == 0){
            printConversionTableOnDegreeZero();
        }
        else {
            double degreeInCelcius = convertToCelsiusFromFahrenheit(degree);
            System.out.println("This degree: "+ degree + "˚F is: "+ String.format("%.2f", degreeInCelcius)+ "˚C");
            double degreeInFahrenheit = convertToFahrenheitFromCelsius(degree);
            System.out.println("This degree: "+ degree + "˚C is: "+ String.format("%.2f", degreeInFahrenheit)+ "˚F");
        }
    }

    public static double convertToCelsiusFromFahrenheit(double degree){
        return ((degree - 32) * 5) / 9;
    }
    public static double convertToFahrenheitFromCelsius(double degree){
        return ((degree * 9) / 5 + 32);
    }

    static public void printConversionTableOnDegreeZero() throws IOException {

        FileWriter writeToFile=new FileWriter("convertionTable.txt");
        System.out.println("\tCelsius        Fahrenheit");
        writeToFile.write("\tCelsius        Fahrenheit\n");
        double startingCelsiusDegree = -20.00;
        while (startingCelsiusDegree <= 25.00){
            double convertedDegreeInFahrenheit = convertToFahrenheitFromCelsius(startingCelsiusDegree);
            System.out.println(String.format("%10.2f",startingCelsiusDegree) + "\t\t" + String.format("%10.2f",convertedDegreeInFahrenheit));
            writeToFile.write(String.format("%10.2f",startingCelsiusDegree) + "\t\t" + String.format("%10.2f",convertedDegreeInFahrenheit) + "\n");
            startingCelsiusDegree += 5.00;
        }

        writeToFile.flush();
        writeToFile.close();
    }

}

