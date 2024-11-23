package com.learning.java.JAVA.advance.java.exceptionHandling;

public class TryCatch {

    /*
    * In Java exception is an “unwanted or unexpected event”, that occurs during the execution
    * of the program. When an exception occurs, the execution of the program gets terminated.
    * To avoid these termination conditions we can use try catch block in Java.
    * */

    /*
    * The try block contains a set of statements where an exception can occur.
    *The catch block is used to handle the uncertain condition of a try block.
    * A try block is always followed by a catch block, which handles the exception
    * that occurs in the associated try block.
     * */

        /*
        * 3. throw in Java
        * The throw keyword is used to transfer control from the try block to the catch block.
         * */


    // Java program that demonstrates the use of throw
    class ThrowExcep {
        static void help()
        {
            try {
                throw new NullPointerException("error_unknown");
            }
            catch (NullPointerException e) {
                System.out.println("Caught inside help().");
                // rethrowing the exception
                throw e;
            }
        }

        public static void main(String args[])
        {
            try {
                help();
            }
            catch (NullPointerException e) {
                System.out.println(
                        "Caught in main error name given below:");
                System.out.println(e);
            }
        }
    }

        /*
        * The throws keyword is used for exception handling without try & catch block.
        * It specifies the exceptions that a method can throw to the caller and does not handle
        * itself.
        *
        * */

    /*
    * finally
    * It is executed after the catch block. We use it to put some common code
    *  (to be executed irrespective of whether an exception has occurred or not )
    * when there are multiple catch blocks.
    * */
    /*
    * 2. What is throw and throws in Java?
        The throw is used for transferring control from the try block to the catch block.
        *Whereas throws is used for exception handling without try & catch block. Throws specify
        * the exceptions that a method can throw to the caller and does not handle itself.    *
    * */


    /*
    * custome exception
    *
    *
    * */

    // A Class that represents use-defined exception

    class MyException extends Exception {
        public MyException(String s)
        {
            // Call constructor of parent Exception
            super(s);
        }
    }

    // A Class that uses above MyException
    public class Main {
        // Driver Program
        public void main(String args[])
        {
            try {
                // Throw an object of user defined exception
                throw new MyException("GeeksGeeks");
            }
            catch (MyException ex) {
                System.out.println("Caught");

                // Print the message from MyException object
                System.out.println(ex.getMessage());
            }
        }
    }





}
