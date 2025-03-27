package linked_list;

import java.util.LinkedList;

public class LinkedList1 {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static LinkedList1 insert(LinkedList1 list, int data) {

        Node new_node = new Node(data);

        // if list is empty
        if(list.head == null) {
            list.head = new_node;
        } else {
            Node temp = list.head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedList1 list) {

        Node temp = list.head;

        System.out.println("LinkedList: ");

        while(temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }

    public static LinkedList1 deleteFromLast(LinkedList1 list) {
        if(list.head == null) {
            System.out.println("List is empty");
            return list;
        }else if(list.head.next == null) {
            list.head = null;
            return list;
        }
        Node temp = list.head;
        while(temp.next.next !=null) {
            temp.next = null;
        }
        return list;
    }

    public static LinkedList1 deleteBykey(LinkedList1 list, int key) {

        if(list.head.data == key) {
            if(list.head.next == null) {
                list.head = null;
                return list;
            }else {
                Node temp = list.head.next;
                list.head.next = null;
                list.head = temp;
            }
        }
        return list;
    }
}
