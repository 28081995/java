package com.bridgelabz.datastructure;

public class StackPgm {
	int msize;
	int top;
	int[] array;

	public StackPgm(int msize) {
		this.msize = msize;
		array = new int[msize];
		top = -1;
	}

	public int push(int i) {
		if (top == msize - 1) {
			System.out.println("stack overflow");
			return i;
		}
		return array[++top] = (int) i;

	}

	public int pop() {
		if (top == -1) {
			System.out.println("stack is empty");
			return -1;
		}
		return array[top--];
	}

	public int peek() {
		if (top == -1) {
			System.out.println("stack empty");
			return -1;
		}
		return array[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int msize() {
		return msize;
	}

	public void print() {
		for (int i = 0; i <= top; i++) {
			System.out.println(array[i]);
		}
	}

}
