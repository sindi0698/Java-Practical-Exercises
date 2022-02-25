package com.practicalexercises2.ex2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfPoints = new ArrayList<>();

        listOfPoints.add(85);
        listOfPoints.add(73);
        listOfPoints.add(70);
        listOfPoints.add(67);
        listOfPoints.add(92);
        listOfPoints.add(57);
        listOfPoints.add(84);
        listOfPoints.add(91);

        Predicate<Integer> check = valueGreaterThan75 -> (valueGreaterThan75 >= 75);
        System.out.println("The declared predicate returns this collection with elements greater than 75: ");
        System.out.println(searchFor(listOfPoints, check));
    }
    public static <T> Collection<T> searchFor(Collection<T> c, Predicate<T> p){
       return c.stream().filter(p).collect(Collectors.toList());
    }
}
