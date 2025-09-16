package com.todo;

import java.sql.Connection;
import java.sql.SQLException;

import com.todo.util.DatabaseConnection;

public class Main
{
    public static void main(String args[])
    {
        DatabaseConnection db_Connection = new DatabaseConnection();

        try{
            Connection cn = db_Connection.getDBConnection();
        }
        catch(SQLException e){
            System.out.println("Connection Failed");
        }
        System.out.println("Success\n");
    }
}