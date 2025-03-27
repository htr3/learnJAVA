package com.learning.java.JAVA.javaLibrariesNUtilities.javaIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BSteam1 {

    public static void main(String[] args) throws IOException {
        FileReader sourceStream = null;

        try {
            sourceStream = new FileReader("test.txt");


            int temp ;
            while((temp = sourceStream.read()) != -1)
                System.out.println((char)temp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            if(sourceStream != null)
                sourceStream.close();
        }
    }

}
