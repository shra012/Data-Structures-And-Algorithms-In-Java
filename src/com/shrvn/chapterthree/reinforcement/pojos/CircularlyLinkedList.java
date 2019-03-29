package com.shrvn.chapterthree.reinforcement.pojos;

public class CircularlyLinkedList<E> {
	private Node<E> tail = null; // we store tail (but not head)
	private int size = 0; // number of nodes in the list
	// ---------------- nested Node class ---------------//
	private static class Node<E> {
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

	public CircularlyLinkedList( ) { }  // constructs an initially empty list
	public int size( ) { return size; } 
	public boolean isEmpty( ) { return size == 0; }

	public E first() {
		if(isEmpty()) return null;
		return tail.getNext().getElement();
	}

	public E last( ) { // returns (but does not remove) the last element
		if (isEmpty( )) return null;
		return tail.getElement( );
	}

	public void addFirst(E element) {
		Node<E> node = new Node<E>(element,null);

		if(isEmpty()) {
			tail = node;
			node.setNext(node);
			return;
		}
		node.setNext(tail.getNext());
		tail.setNext(node);
	}
}
