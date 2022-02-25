package com.practicalexercises3.ex8;

public class OracleConnection extends Connection{
    @Override
    public void connectWithDatabase() {
        System.out.println("Connection to Oracle database was successful.");
    }
}
