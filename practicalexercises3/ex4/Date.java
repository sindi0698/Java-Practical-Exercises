package com.practicalexercises3.ex4;

public class Date implements Comparable<Date>{
    int month;
    int day;
    int year;

    Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    @Override
    public int compareTo(Date other) {
        return (this.year == other.year) ? ((this.month == other.month) ? this.day - other.day : 1) : 1;
    }

    @Override
    public String toString() {
        return "Date{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
