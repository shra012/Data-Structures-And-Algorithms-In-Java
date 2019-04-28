package com.shrvn.chapterthree.reinforcement.pojos;

import org.omg.PortableInterceptor.INACTIVE;

public class Runner {

    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list = new CircularlyLinkedList<Integer>();
        list.addFirst(10);
        list.addFirst(2);
        list.addFirst(4);
        list.addFirst(6);
        list.addFirst(12);
        System.out.println(list);
    }
}
