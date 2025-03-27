package com.learning.java.JAVA.javaLibrariesNUtilities.javaIO;

import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args) throws IOException {

        // for reading input
        InputStreamReader inp = null;

        // storing the input in inp
        inp = new InputStreamReader(System.in);

        System.out.println("Enter characters, " + " and '0' to quit.");

        char c;

        do {
            c = (char)inp.read();
            System.out.println(c);
        }while(c != '0');
    }


}
