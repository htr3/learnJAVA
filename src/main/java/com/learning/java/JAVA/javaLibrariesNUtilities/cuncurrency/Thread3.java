package com.learning.java.JAVA.javaLibrariesNUtilities.cuncurrency;

public class Thread3 {

    public static void main(String[] args) {
        Thread t = new Thread("Thread start....");

        t.start();

        String s = t.getName();

        System.out.println(s);



    }

}
