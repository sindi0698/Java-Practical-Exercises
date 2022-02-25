package com.practicalexercises3.ex8;

public class ConnectionFactory {
    public Connection getConnection(String connection){
        if(connection.equals("sql")){
            return new SQLConnection();
        }
        if(connection.equals("oracle")){
            return new OracleConnection();
        }
        return null;
    }
}
