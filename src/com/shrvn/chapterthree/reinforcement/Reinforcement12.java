package com.shrvn.chapterthree.reinforcement;

import com.shrvn.chapterthree.reinforcement.pojos.SinglyLinkedList;

public class Reinforcement12 {
	public static void main(String[] args) {
		SinglyLinkedList<Integer> linkedList = SinglyLinkedList.createList(1,2,3,4,5);
		linkedList.rotate(2);
		System.out.println(linkedList);
	}
}
