package com.learning.java.JAVA.javaLibrariesNUtilities.javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BStream {

    public static void main(String[] args) throws IOException {

        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try {
            sourceStream = new FileInputStream("sourcefile.txt");
            targetStream = new FileOutputStream("targetfile.txt");

            int temp;

            while((temp = sourceStream.read())!= -1)
                targetStream.write((byte)temp);

        } finally {
            if(sourceStream != null)
                sourceStream.close();
            if(targetStream != null)
                targetStream.close();
        }


    }



}
