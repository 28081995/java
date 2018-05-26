package com.bridgelabz.datastructure;

public class LinkedList {
	Node head = null;
	int size = 0;
	int pos;
	public void add(Object data) {
		Node n1 = new Node(data);
		if (head == null) {
			head = n1;
			size++;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = (Node) temp.next;
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
	public int index(Object data) {
		int count = 0;
		Node tempCurrent = head;
		while (tempCurrent.next != null) {
			tempCurrent = tempCurrent.next;
			count++;
		}
		tempCurrent.data = data;
		return count;
	}
	public Object remove(String search) {
		
		return search;
	}
	public int size() {
		if (head == null)
			return 0;
		int size = 0;
		while (head != null)
			size++;
		return size;
	}
	public void print() {
		if (size == 0) {
			System.out.println("linkedlist empty");
		}
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public String pop(int i) {
		
		
		return null;
	}
}
