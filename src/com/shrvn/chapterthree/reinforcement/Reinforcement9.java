package com.shrvn.chapterthree.reinforcement;

import com.shrvn.chapterthree.reinforcement.pojos.DoublyLinkedList;
import com.shrvn.chapterthree.reinforcement.pojos.SinglyLinkedList;
import com.shrvn.chapterthree.reinforcement.pojos.SinglyLinkedList.Node;

public class Reinforcement9 {
	public static void main(String[] args) {
		Reinforcement9 reinforcement = new Reinforcement9();
		SinglyLinkedList<Integer> list = SinglyLinkedList.createList(1,7,5);
		int size = reinforcement.size(list);
		System.out.println(size);
		
		DoublyLinkedList<Integer> dList = DoublyLinkedList.createList(null);
		int size1 = reinforcement.size(dList);
		System.out.println(size1);
	}
	
	public int size(SinglyLinkedList<?> list) {
		Node<?> first = list.getHead();
		int i=0;
		for(; first!=null;i++ ) {
			first = first.getNext();
		}
		return i;
	}
	
	public int size(DoublyLinkedList<?> list) {
		com.shrvn.chapterthree.reinforcement.pojos.DoublyLinkedList.Node<?> header = list.getHeader();
		com.shrvn.chapterthree.reinforcement.pojos.DoublyLinkedList.Node<?> first = header.getNext();
		int i=0;
		for(; first.getNext()!=null;i++ ) {
			first = first.getNext();
		}
		return i;
	}
}
