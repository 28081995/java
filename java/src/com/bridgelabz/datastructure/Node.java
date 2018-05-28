package com.bridgelabz.datastructure;

public class Node<T> {
	T ele;
	Node<T> next;

	public Node(T ele) {
		this.ele = ele;
	}

	public Node(T ele, Node<T> next) {
		this.ele = ele;
		this.next = next;
	}

	public T getValue() {
		return ele;
	}
}
