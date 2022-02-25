package com.practicalexercises3.ex2;


import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String wordToWriteInFile;

        IOFile ioFile = new IOFile("src/com/practicalexercises3/testFileEx2.txt");
        IOFile fileToDelete = new IOFile("src/com/practicalexercises3/fileToDelete.txt");

        OutputStream os = new FileOutputStream(String.valueOf(ioFile), true);

        System.out.print("The number of lines written in this file is: ");
        System.out.println(ioFile.countLines());

        System.out.println("This function will print the content of the file in the console:");
        ioFile.print();

        System.out.println("This function will write your content of the string to an Output Stream: ");
        System.out.println("Please enter a string to print in testFileEx2.txt: ");
        wordToWriteInFile = input.nextLine();
        ioFile.write(os,wordToWriteInFile);

        System.out.println("This function will delete the file in the specified path " + fileToDelete);
        fileToDelete.delete();

        System.out.println("This function will copy the content of the file");
        System.out.print("Please enter the path where you want to copy it:");
        String pathToCopy = input.nextLine();
        ioFile.copy(pathToCopy);
    }
}
