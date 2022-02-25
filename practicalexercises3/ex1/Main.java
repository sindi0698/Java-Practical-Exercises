package com.practicalexercises3.ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static  void main(String[] args) throws IOException {

        File fileToReadFrom = new File("src/com/practicalexercises3/textFileWithWordsEx1.txt");
        ArrayList<String> listOfWords = new ArrayList<>();
        String lineOfFile;
        try (FileReader fileReader = new FileReader(fileToReadFrom); BufferedReader bufferedReader = new BufferedReader(fileReader)){
            while ((lineOfFile = bufferedReader.readLine()) != null) {
                listOfWords.add(lineOfFile);
            }
            Collections.sort(listOfWords);
            ArrayList<String> sortedList = removeDuplicates(listOfWords);
            System.out.println("Content words of text file as a list:");
            System.out.println(sortedList.stream().map(String::toLowerCase).collect(Collectors.toList()));
            System.out.println("Content words of text file as a text:");
            printItemsOfList(sortedList.stream().map(String::toLowerCase).collect(Collectors.toList()));
        } catch (FileNotFoundException e) {
            System.out.println("This file does not exist.");
        } catch (IOException e) {
            System.out.println("The buffered reader is empty.");
        }
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
        ArrayList<T> sortedList = new ArrayList<T>();
        for (T wordOfList : list){
            if( !sortedList.contains(wordOfList)){
                sortedList.add(wordOfList);
            }
        }
        return sortedList;
    }
    private static void printItemsOfList(List<String> collect) {
        for(String item: collect){
            System.out.print(item + " ");
        }
    }
}
