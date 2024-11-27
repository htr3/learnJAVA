package com.learning.java.JAVA.advance.java.generics;

import static com.learning.java.JAVA.advance.java.generics.Test.genericDisplay;

public class GenericMethods {
    public static void main(String[] args) {
        genericDisplay(11);

        genericDisplay("vishal ");

        genericDisplay(11.11);
    }


}


class Test {
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() +
                 " = " + element);
    }
}

