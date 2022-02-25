package com.practicalexercises3.ex8;

public class Main {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();

        Connection sql = connectionFactory.getConnection("sql");
        sql.connectWithDatabase();

        Connection oracle = connectionFactory.getConnection("oracle");
        oracle.connectWithDatabase();

    }
}
