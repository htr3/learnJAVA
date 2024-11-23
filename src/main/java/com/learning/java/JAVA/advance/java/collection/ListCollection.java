package com.learning.java.JAVA.advance.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {

    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {


        ListCollection listCollection = new ListCollection();
        listCollection.display();
        listCollection.add(1);
        listCollection.display();
        List<Integer> list1 = new ArrayList<>();
        listCollection.addAll(list1);
        listCollection.remove(1);



    }
    public void addAll(List<Integer> list1) {
        this.list.addAll(1 , list1);
    }

    public void remove(int i) {
        list.remove(i);
    }

    public void display() {

        // Display list
        System.out.println("List element " + list);
    }


    public void add(Integer a) {
        list.add(a);
    }





}
