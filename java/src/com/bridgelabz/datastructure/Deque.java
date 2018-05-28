package com.bridgelabz.datastructure;

public class Deque<T extends Comparable<T>> {
	public class Node
	{
		T data;
		Node next;
		public Node(Comparable data2) {
			this.data = (T) data2;
		}
		
		int size;
		Node front;
		Node rear;
	public void addRear(T data)
	{
		
		Node node1=new Node(data);
		if(front==null ||rear==null)
		{
			front=node1;
			rear=node1;
			size++;
	
		}
		rear.next=node1;
		rear=node1;
		size++;
	}
	public Comparable removeRear()
	{
		Node temp=front;
		while(temp.next!=rear)
		{
			temp=temp.next;
		}
		rear=temp;
		rear.next=null;
		size--;
		return (Comparable) rear.data;
	}
	public void addFront(Comparable data)
	{
		Node node1=new Node(data);
		node1.next=front;
		front=node1;
		size++;;
	}
	public Comparable<String> removeFront()
	{
		if(front==null)
		return "EMPTY QUEUE";
		T data=front.data;
		front=front.next;
		if(front==null)
		{
			rear=null;
		}
		size--;
		return (Comparable) data;
	}
	public boolean isEmpty()
	{
		if(size==0)
			return true;
		return false;
	}
	public void display()
	{
		Node temp=front;
		while(temp!=null)
		{
			temp=temp.next;
		}
	}
	}
}
