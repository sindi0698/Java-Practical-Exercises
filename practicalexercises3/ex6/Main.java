package com.practicalexercises3.ex6;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid IP address:");
        String ip = input.nextLine();
        if(checkForValidIPAddress(ip)){
            System.out.println("This IP is valid");
        }
        else {
            System.out.println("This IP is not valid!");
        }
    }

    public static boolean checkForValidIPAddress(String ip){
        if(ip == null) {
            System.out.println("There is no IP entered!");
        }
        Pattern pattern = Pattern.compile(generateRegularExpression());
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static String generateRegularExpression(){
        String singlePartPattern0to255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
        return singlePartPattern0to255 + "\\." + singlePartPattern0to255 + "\\." + singlePartPattern0to255 + "\\." + singlePartPattern0to255;
    }
}
