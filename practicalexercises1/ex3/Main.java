package com.practicalexercises1.ex3;

public class Main {
    static int winnerCounter = 0;
    static int secondPlaceCounter = 0;
    public static void main(String[] args) {
        String[] names = {"Corliss Housee", "Eda Lewine", "John Parker", "Elsa Lewis", "Nell Burns", "Wilfred Bourkee", "Kendrick Ewart"};
        String[] game1 = {"Eda Lewine", "Corliss Housee", "John Parker", "Elsa Lewis"};
        String[] game2 = {"Eda Lewine", "Nell Burns", "Wilfred Bourkee", "Kendrick Ewart"};
        String[] game3 = {"Eda Lewine", "Nell Burns", "Corliss Housee", "Kendrick Ewart"};
        for (String name : names) {
            winnerCounter = 0;
            secondPlaceCounter = 0;
            checkPoints(name, game1);
            checkPoints(name, game2);
            checkPoints(name, game3);
            System.out.println(name + " has " + winnerCounter + " first places and " + secondPlaceCounter + " second places.");
        }
    }
    public static void checkPoints(String name, String[] game) {
        if (game[0].equals(name)) {
            winnerCounter++;
        } else if (game[1].equals(name)) {
            secondPlaceCounter++;
        }
    }
}