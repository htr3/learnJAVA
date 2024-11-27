package com.learning.java.JAVA.advance.java.generics;

public class GenericClassesAndInterfaces<T> {

    T obj;
    GenericClassesAndInterfaces(T obj) {
        this.obj = obj;
    }

    public T getObj() { return this.obj; }
}

class Multiple<T,U> {
    T obj1;
    U obj2;

    Multiple(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print() {
        System.out.println("Obj1 with T is :" + obj1);
        System.out.println("Obj2 is : " + obj2);
    }

}


class Main {
    public static void main(String[] args) {
        GenericClassesAndInterfaces<Integer> iObj = new GenericClassesAndInterfaces<>(23);

        System.out.println(iObj.getObj());

        GenericClassesAndInterfaces<String> sObj = new GenericClassesAndInterfaces<>("Hii Vishal is here");

        System.out.println(sObj.getObj());

        Multiple<String, Integer> multiple = new Multiple<>("Vishal", 25);

        multiple.print();

    }
}
