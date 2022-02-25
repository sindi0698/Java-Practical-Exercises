package com.practicalexercises2.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentScore sindiDhima = new StudentScore("Sindi", "Dhima", 85);
        StudentScore keidiGjika = new StudentScore("Keidi", "Gjika", 90);
        StudentScore grasjelaQyli = new StudentScore("Grasjela", "Qyli", 87);
        StudentScore loertShahini = new StudentScore("Loert", "Shahini", 97);

        List<StudentScore> studentScoreData = new ArrayList<>();
        studentScoreData.add(sindiDhima);
        studentScoreData.add(keidiGjika);
        studentScoreData.add(grasjelaQyli);
        studentScoreData.add(loertShahini);

        System.out.println("The list of students is: ");
        printStudentNameAndScore(studentScoreData);
        System.out.println("The overall average on this test for all the students is: " + String.format("%.2f",printAverageForAllStudents(studentScoreData)));
        sortStudentsByScore(studentScoreData);
        System.out.println("Sorted students ordered by score: " + studentScoreData);
        List<String> bestStudents = checkForBestStudents(studentScoreData);
        System.out.println("Name of students with scores greater than 90: ");
        printNamesOfBestStudents(bestStudents);
    }

    public static double printAverageForAllStudents(List<StudentScore> studentList){
        double sumOfAllAverages = 0;
        for(StudentScore student: studentList){
            sumOfAllAverages += student.getScore();
        }
        return sumOfAllAverages/studentList.size();
    }

    public static void printStudentNameAndScore(List<StudentScore> studentList){
        for(StudentScore student: studentList){
            System.out.println(student);
        }
    }

    public static void sortStudentsByScore(List<StudentScore> studentList){
        studentList.sort(new ScoreComparator());
    }

    public static List<String> checkForBestStudents(List<StudentScore> studentList){
        List<String> namesOfStudentsWithHighestScore = new ArrayList<>();
        for(StudentScore student: studentList){
            if(student.getScore() >= 90){
                namesOfStudentsWithHighestScore.add(student.getFirstName() + " " + student.getLastName());
            }
        }
        return namesOfStudentsWithHighestScore;
    }

    public static void printNamesOfBestStudents(List<String> namesOfStudentsWithHighestScore){
        for(String student: namesOfStudentsWithHighestScore) {
            System.out.println(student);
        }
        }
}

