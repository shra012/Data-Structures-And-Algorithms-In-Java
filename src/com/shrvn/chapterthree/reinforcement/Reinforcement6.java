package com.shrvn.chapterthree.reinforcement;

import com.shrvn.chapterthree.reinforcement.pojos.SinglyLinkedList;

public class Reinforcement6 {
	private static SinglyLinkedList<Integer> list = SinglyLinkedList.createList(1,2,3,4,5);
	public static void main(String[] args) {
		System.out.println(list.getSecondLast());
	}
}
