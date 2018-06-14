
package com.bridgelabz.datastructure;

import java.util.NoSuchElementException;

/**
 * @author bridgelabz
 *
 * @param <T>
 */
public class QueueLinklist<T extends Comparable<T>> {
	protected Node1 front, rear;
	public int size;

	public QueueLinklist() {
		front = null;
		rear = null;
		size = 0;
	}

	/* Function to check if queue is empty */
	/**
	 * @return
	 */
	public boolean isEmpty() {
		return front == null;
	}

	/* Function to get the size of the queue */
	/**
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/* Function to insert an element to the queue */
	/**
	 * @param data
	 */
	public void insert(T data) {
		Node1 nptr = new Node1(data, null);
		if (rear == null) {
			front = nptr;
			rear = nptr;
		} else {
			rear.setLink(nptr);
			rear = rear.getLink();
		}
		size++;
	}

	/* Function to remove front element from the queue */
	/**
	 * @return
	 */
	public int remove() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		Node1 ptr = front;
		front = ptr.getLink();
		if (front == null)
			rear = null;
		size--;
		return (int) ptr.getData();
	}

	/* Function to check the front element of the queue */
	/**
	 * @return
	 */
	public int peek() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return (int) front.getData();
	}

	/* Function to display the status of the queue */
	/**
	 * 
	 */
	public void display() {
		if (size == 0) {
			System.out.print("Empty\n");
			return;
		}
		Node1 ptr = front;
		while (ptr != rear.getLink()) {
			System.out.print(ptr.getData() + " ");
			ptr = ptr.getLink();
		}
	}

	public Comparable pop() {
		Node1 last = front;
		if (front.next == null) {
			Comparable c = (Comparable) front.data;
			front = null;
			size--;
			return c;
		}
		for (int j = 1; j < getSize() - 1; j++) {
			last = last.next;
		}
		Node1 temp = last.next;
		last.next = null;
		size--;
		return (Comparable) temp.data;
		
	}

	/**
	 * @param i
	 * @return
	 */
	public Comparable pop(int pos) {
		if (pos == 0) {
			Node1 temp = front;
			front = front.next;
			size--;
			return (Comparable) temp.data;
		}
		if (pos == getSize()) {
			Node1 last = front;
			for (int i = 1; i < getSize() - 1; i++) {
				last = last.next;
			}
			Node1 temp = last.next;
			last.next = null;
			size--;
			return (Comparable) temp.data;
		}
		Node1 last = front;
		for (int i = 1; i < pos - 1; i++) {
			last = last.next;
		}
		Node1 temp = last.next;
		last.next = last.next.next;
		size--;
		return (Comparable) temp.data;

	}

	/**
	 * @param string
	 */
	public void addSort(String data) {
		Node1 node1 = new Node1(data);
		Node1 current = null;
		if (front == null || ((Comparable<T>) front.data).compareTo((T) node1.data) > 0) {
			node1.next = front;
			front = node1;
			size++;
			// System.out.println(item + " added successfully");
			return;
		} else {
			current = front;
			rear = front;
			while (current.next != null && ((Comparable<T>) current.next.data).compareTo((T) node1.data) < 0) {
				current = current.next;
			}
			node1.next = current.next;
			current.next = node1;
			size++;
			// System.out.println(item + " added successfully");
			while (rear.next != null) {
				rear = rear.next;
			}
			return;
		}

	}

}
