package com.practicalexercises3.ex8;

public class SQLConnection extends Connection{
    @Override
    public void connectWithDatabase() {
        System.out.println("Connection to SQL Server database was successful.");
    }
}
