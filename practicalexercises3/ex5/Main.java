package com.practicalexercises3.ex5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = populateList(2, 20);
        System.out.println("The list of even numbers is: ");
        printEvens(list);
    }
    public static List<Integer> populateList(int startPoint, int endPoint){
        return IntStream.rangeClosed(startPoint, endPoint).boxed().collect(Collectors.toList());
    }
    public static void printEvens(List<Integer> numbers){
         numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }
}
