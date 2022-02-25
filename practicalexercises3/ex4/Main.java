package com.practicalexercises3.ex4;
import java.util.Collections;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<Date, String> schedule = new TreeMap<>();
        populateTreeMap(schedule);
        for(Map.Entry<Date, String> entry: schedule.entrySet()){
            if(entry.getKey().month == 3){
                System.out.println("Date for March 2022: " + entry.getValue());
            }
        }
    }

    public static void populateTreeMap(TreeMap<Date, String> schedule){
        for(int month = 1; month <= 12; month++){
            for(int day = 1; day <= 30; day++){
                Date dateOfMonth = new Date(month, day, 2022);
                schedule.put(dateOfMonth, dateOfMonth.toString());
            }
        }
    }
}
