package com.shrvn.chapterthree.reinforcement.pojos;

public class SinglyLinkedList<E> implements Cloneable {
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

	// instance variables of the SinglyLinkedList
	private Node<E> head = null;               // head node of the list (or null if empty)
	private Node<E> tail = null;               // last node of the list (or null if empty
	private int size = 0;                      // number of nodes in the list

	public SinglyLinkedList() {
		// constructs an initially empty list
	}
	// returns head node of the list (or null if empty)
	public Node<E> getHead() {
		return head;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	@SuppressWarnings("unchecked")
	public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
		SinglyLinkedList<E> clone = (SinglyLinkedList<E>) super.clone();
		if(size()>0){
			clone.head = new Node<E>(head.getElement(),null);
			Node<E> traverse = head.getNext();
			Node<E> cloneTail = clone.head;
			while(traverse!=null){
				Node<E> newNode = new Node<E>(traverse.getElement(),null);
				cloneTail.setNext(newNode);
				cloneTail = newNode;
				traverse = traverse.getNext();
			}
		}
		return clone;
	}

	/**
	 * @return head (but does not remove) the first element
	 */
	public E first() {
		if (isEmpty())
			return null;
		return head.getElement();
	}

	/**
	 * @return last (but does not remove) the last element
	 */
	public E last() {
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	// -------Update methods of Singly Linked List------//

	/**
	 * Adds element e to the front of the list
	 * @param e
	 */
	public void addFirst(E e) {
		head = new Node<>(e, head);
		if (size == 0)
			tail = head;                       // special case: new node becomes tail also
		size++;
	}


	/**
	 * Adds element e to the end of the list
	 * @param e
	 */
	public void addLast(E e) { 
		Node<E> newest = new Node<>(e, null);  // node will eventually be the tail
		if (isEmpty())
			head = newest;                     // special case: previously empty list
		else
			tail.setNext(newest);
		tail = newest;
		size++;
	}

	/**
	 * Removes and returns the first element
	 * @return E
	 */
	public E removeFirst( ) {
		if (isEmpty( )) return null;
		E answer = head.getElement(); 
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null; return answer;
	}

	@SafeVarargs // Added safe variable arguments to avoid heap pollution Refer https://softwareengineering.stackexchange.com/questions/155994/java-heap-pollution.
	public static <E> SinglyLinkedList<E> createList(E... args){
		SinglyLinkedList<E> list = new SinglyLinkedList<E>();
		if(null==args) return list;
		for(E arg : args){
			list.addLast(arg);
		}
		return list;
	}

	/**
	 * Get the second to last element of a linkedlist
	 */
	public Node<E> getSecondLast() {
		if(isEmpty()) return null;
		Node<E> current = head;
		while(null!=current.getNext().getNext()) {
			current=current.getNext();
		}
		return current;
	}

	@Override
	public String toString() {
		StringBuilder sb =  new StringBuilder("SinglyLinkedList [");
		Node<E> current = head;
		while(current!=null) {
			sb.append(current);
			current=current.getNext();
			sb.append(" --> ");
		}
		sb.append("null]");
		return sb.toString();
	}
	/**
	 * This method rotates all the nodes one by one till the node in the given position becomes the first node.
	 * @param position The node where the rotation should stop.
	 * @return
	 */
	public void rotate(int position) {
		if(isEmpty()) return;
		while(position>0) {
			addLast(removeFirst());
			position--;
		}
	}
}

