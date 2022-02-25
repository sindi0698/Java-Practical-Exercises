package com.practicalexercises2.ex1;

import java.util.Comparator;

public class ScoreComparator implements Comparator<StudentScore> {
    @Override
    public int compare(StudentScore firstStudent, StudentScore secondStudent) {
        return Integer.compare(firstStudent.getScore(), secondStudent.getScore());
    }
}
