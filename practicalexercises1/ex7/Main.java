package com.practicalexercises1.ex7;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static int winPrice;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Please enter a guessed number of 4 digits: ");
        try{
                String enteredNumber = input.nextLine();
                checkNumericValue(enteredNumber);
                String randomNumber = generateNumber();
                if (checkCorrectGuess(enteredNumber, randomNumber)) {
                    winPrice = 500;
                    System.out.println("You guessed the number correctly!");
                } else if (checkMatchingGuess(enteredNumber, randomNumber)) {
                    winPrice = 100;
                    System.out.println("You guessed 4 digits correctly but not in the correct places!");
                } else if (singleGuess(enteredNumber, randomNumber)) {
                    winPrice = 10;
                    System.out.println("You guessed one digit correctly!");
                } else {
                    winPrice = 0;
                    System.out.println("You did not guess the number!");
                }
                System.out.println("Number was: " + randomNumber);
                System.out.println("You won " + winPrice + " euros!");

        } catch (NonNumericValueException e) {
            System.out.println(e);
        }

    }
    public static void checkNumericValue(String numberGuessed) throws NonNumericValueException{
        String regularExpression = ".*[a-zA-Z].*";
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcherText = pattern.matcher(numberGuessed);
        if(matcherText.matches()){
            throw new NonNumericValueException("This is not a number, please enter only digits!!!");
        }
    }
    public static String generateNumber() {
        Random random = new Random();
        int randomGeneratedNumber = random.nextInt(9999);
        String randomNumber = String.format("%04d", randomGeneratedNumber);
        return randomNumber;
    }

    public static boolean checkCorrectGuess(String guessedNumber, String programNumber) {
        if (guessedNumber.equals(programNumber))
            return true;
        return false;
    }

    public static boolean checkMatchingGuess(String guessedNumber, String programNumber) {
        int correctGuesses = 0;
        for (int character = 0; character < guessedNumber.length(); character++) {
            if (programNumber.charAt(character) == guessedNumber.charAt(0)
                    || programNumber.charAt(character) == guessedNumber.charAt(1)
                    || programNumber.charAt(character) == guessedNumber.charAt(2)
                    || programNumber.charAt(character) == guessedNumber.charAt(3)) {
                correctGuesses++;
            }
        }
        if (correctGuesses == 4)
            return true;
        return false;
    }

    public static boolean singleGuess(String guessedNumber, String programNumber) {
        int correctGuesses = 0;
        for (int index = 0; index < guessedNumber.length(); index++) {
            if (programNumber.charAt(index) == guessedNumber.charAt(0)
                    || programNumber.charAt(index) == guessedNumber.charAt(1)
                    || programNumber.charAt(index) == guessedNumber.charAt(2)
                    || programNumber.charAt(index) == guessedNumber.charAt(3)) {
                correctGuesses++;
            }
        }
        if (correctGuesses == 1)
            return true;
        return false;

    }
}
