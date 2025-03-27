package com.learning.java.JAVA.javaLibrariesNUtilities.cuncurrency;

public class Thread2 implements Runnable {



    public void run() {
        System.out.println("Thread is Running Successfully");
    }


    public static void main(String[] args) {

        Thread2 thread2 = new Thread2();

        Thread thread = new Thread(thread2);

        thread.run();




    }

}
