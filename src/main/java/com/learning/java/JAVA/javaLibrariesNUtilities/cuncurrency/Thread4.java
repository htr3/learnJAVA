package com.learning.java.JAVA.javaLibrariesNUtilities.cuncurrency;

public class Thread4 implements Runnable{

    public void run() {
        System.out.println("Thread is creaded and running successfully......");
    }


    public static void main(String[] args) {


        Runnable r1 = new Thread4();

        Thread t1 = new Thread(r1, "vishal Thread");

        t1.start();

        String s1 = t1.getName();

        System.out.println(s1);
    }
    
}
