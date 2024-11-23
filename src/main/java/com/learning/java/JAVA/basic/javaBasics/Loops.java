package com.learning.java.JAVA.basic.javaBasics;

import java.util.Scanner;

public class Loops {


    public void forLoop() {

        System.out.println("For Loop ");

        // print no. from 1 to 10;

        for(int i =0; i<=10; i++)
            System.out.print(i + " ");

        System.out.println();

        // print array
        String array[] = {"Vishal", "Thakur", "Sonu", "Singh", "Thakur"};

        for(String x : array)
            System.out.print(x + " ");


    }


    public void whileLoop() {
        System.out.println("whileLoop");
    }

    public void switchStatement() {

        Scanner input  = new Scanner(System.in);

        System.out.println("Enter month no. ");
        int month = input.nextInt();

        switch(month) {

            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("fab");
            case 3:
                System.out.println("march");
            case 4:
                System.out.println("april");
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("ausgest");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("oct");
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("dec");
            default:
                System.out.println("Please enter a correct no.");
        }


    }



}
