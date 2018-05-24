package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class LinkedList {
	Node head = null;
	int size = 0;

	public void add(Object data) {
		Node n1 = new Node(data);
		if (head == null) {
			head = n1;
			size++;
		}
		Node temp = head;
		while (temp.next != null) {
		temp = (Node)temp.next;
		temp.next = n1;
		size++;
		return;
		}
	}
	public void addFirst(Object data) {
		Node n1 = new Node(data);
		n1.next = head;
		head = n1;
		size++;
		return;
	}

	public boolean search() {
		Utility u = new Utility();
		System.out.println("enter the word to be search");
		String sword = u.inputString();
		Node current = head;

		while (current != null) {
			if (current.data == sword)
				return true;
			else
			current = current.next;
		}
		return false;
	}

	public void print() {
		if (size == 0) {
			System.out.println("linkedlist empty");
		}
		Node temp = head;
		while (temp!= null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
