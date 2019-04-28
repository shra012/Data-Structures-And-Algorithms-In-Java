package com.shrvn.chapterthree.reinforcement;

import com.shrvn.chapterthree.reinforcement.pojos.DoublyLinkedList;

public class Reinforcement8 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.addFirst(8);
        list.addFirst(9);
        list.addFirst(10);
        System.out.println(list.hopperMidNode());
    }
}
