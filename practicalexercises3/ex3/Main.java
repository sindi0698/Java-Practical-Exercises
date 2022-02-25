package com.practicalexercises3.ex3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ListCDs listCDs = new ListCDs();
        System.out.println("Actual list of CDs:");
        System.out.println(listCDs.printCDs());

        System.out.println("Total price of CDs is: ");
        System.out.println(listCDs.calculateTotalPriceOfCDs());

        CD newCD = new CD("One Direction", "Take me home", 2015, 80);
        listCDs.insertCd(newCD);

        System.out.println("Updated List of CDs:");
        System.out.println(listCDs.printCDs());

        System.out.println("Updated Total price of CDs is: ");
        System.out.println(listCDs.calculateTotalPriceOfCDs());

        System.out.println("Please enter the name of the author you want to search the CD playlist for: ");
        String authorName = input.nextLine();
        if (authorName.matches(".*[A-Za-z].*")) {
            System.out.println("The CDs from author " + authorName + ":");
            System.out.println(listCDs.listOfCDsForAuthor(authorName));
        } else {

            System.out.println("Please enter a valid author name!!! ");
        }
        listCDs.deleteCd("Funeral");

        listCDs.deleteCd("Hi");
        System.out.println("Updated List of CDs:");
        System.out.println(listCDs.printCDs());

    }

}
