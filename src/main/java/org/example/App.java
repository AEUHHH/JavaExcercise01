package org.example;

import java.util.Scanner;




public class App{

    public static void main(String[] args)
    {

        Scanner std_in = new Scanner( System.in );

        String UserName; // user's name,entered by the user.


        System.out.print("What is your name? ");
        UserName = std_in.nextLine();


        System.out.println("Hello, " + UserName + ", nice to meet you!");

    }

}
