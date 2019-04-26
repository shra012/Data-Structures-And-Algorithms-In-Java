package com.shrvn.chapterthree.reinforcement.pojos;

public class CircularlyLinkedList<E> {
	private Node<E> tail = null; // we store tail (but not head)
	private int size = 0; // number of nodes in the list
	// ---------------- nested Node class ---------------//
	public static class Node<E> {
		private E element;                     // reference to the element stored at this node
		private Node<E> next;                  // reference to the subsequent node in the list

		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			next = n;
		}
		@Override
		public String toString() {
			return (element!=null)?element.toString():"";
		}
	}

	// ----------- end of nested Node class -----------//

	public CircularlyLinkedList(	) { }  // constructs an initially empty list
	public int size() { return size; } 
	public boolean isEmpty( ) { return size == 0; }
	
	/** returns first node of the list (or null if empty). */
	public Node<E> getHead() {
		if(tail==null) return null;
		
		return tail.getNext();
	}

	public E first() {// returns (but does not remove) the first element
		if(isEmpty()) return null;
		return tail.getNext().getElement();
	}

	public E last() { // returns (but does not remove) the last element
		if (isEmpty()) return null;
		return tail.getElement();
	}

	public void addFirst(E element) {
		Node<E> node = new Node<E>(element,null);
		if(isEmpty()) {
			tail = node;
			tail.setNext(tail);
		}else {
			node = new Node<E>(element,tail.getNext());
			tail.setNext(node);
		}
		size++;
	}

	public void addLast(E element) {
		addFirst(element);
		tail = tail.getNext();
	}
	
	
	public E removeFirst() {
		Node<E> head = null;
		if(isEmpty()) {
			return null;
		}
		head = tail.getNext();
		tail.setNext(tail.getNext().getNext());
		size--;
		return head.getElement();
	}
	
	public void rotate() {
		if(isEmpty()) return;
		tail = tail.getNext();
	}
	
	/* Method for creating the Linked List */
	@SafeVarargs // Added safe variable arguments to avoid heap pollution Refer https://softwareengineering.stackexchange.com/questions/155994/java-heap-pollution.
	public static <E> CircularlyLinkedList<E> createDoublyList(E... args){
		CircularlyLinkedList<E> list = new CircularlyLinkedList<E>();
		for(E arg : args){
			list.addLast(arg);
		}
		return list;
	}
	
	@SafeVarargs // Added safe variable arguments to avoid heap pollution Refer https://softwareengineering.stackexchange.com/questions/155994/java-heap-pollution.
	public static <E> CircularlyLinkedList<E> createList(E... args){
		CircularlyLinkedList<E> list = new CircularlyLinkedList<E>();
		if(null==args) return list;
		for(E arg : args){
			list.addLast(arg);
		}
		return list;
	}
}
