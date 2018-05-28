package com.bridgelabz.datastructure;

public class MyLinkedList<T extends Comparable<T>> {
    private Node<T> first;
    private Node<T> last;
    private int count = 0;

    /**
     * Insert at the front of the list
     *
     * @param Object
     *            element
     */
    public void add(T ele) {
        if (first == null) {
            first = new Node<T>(ele);
            last = first;
            count++;
            return;
        }
        /**
         * Recursively traverse this list and add the node value at last
         *
         * @param node
         *            element
         */
        last.next = new Node<T>(ele);
        last = last.next;
        count++;

    }

    public void add(int pos, T ele) {
        if (pos == 0) {
            first = new Node<T>(ele, first);
            count++;
            return;
        }
        Node<T> temp = first;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        temp.next = new Node<T>(ele, temp.next);
        count++;

    }

    public int size() {
        return count;
    }

    /**
     * Remove the elment based on type of element
     *
     * @param Object
     *            key
     */
    public void deleteNode(T key) {
        Node<T> temp = first;
        Node<T> prev = null;
        if (temp != null && temp.ele.compareTo(key) == 0) {
            first = temp.next; // Changed head
            count--;
            return;
        }
        while (temp != null && temp.ele != key) {
            prev = temp;
            temp = temp.next;
            count--;
        }
        if (temp == null)
            return;
        prev.next = temp.next;
    }

    public T deleteAtindex(int index) {
        if (index == 0) {
            T a = first.ele;
            first = first.next;
            count--;
            return a;
        }
        Node<T> temp = first;
        int k = 0;
        while (k < index - 1) {
            temp = temp.next;
            k++;
        }
        T a = temp.ele;
        temp.next = temp.next.next;
        count--;
        return a;

    }

    /**
     * Recursively traverse this list and print the node value
     */
    public void dispay() {
        Node<T> temp = first;
        while (temp != null) {

            System.out.println(temp.ele);
            temp = temp.next;
        }
    }

    public T getvalue(int index) {
        Node<T> temp = first;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                return temp.ele;
            }
            count++;
            temp = temp.next;
        }
        return null;
    }
   
    public boolean search(T value) {
        Node<T> temp=first;
        while(temp!=null) {
            if(temp.ele.compareTo((T) value)==0)
                return true;
             temp=temp.next;
        }     
           
        return false;
    }

    public <T extends Comparable<T>>void addSorted(T ele) {
        if(first==null) {
            first = new Node(ele);
            last = first;
        } else {
            Node temp = first;
            while(temp.next != null && ((Comparable<T>) temp.next.ele) .compareTo (ele)<0) {
                temp =temp.next;
            }

            last = new Node(ele);
            last.next = temp.next;
            temp.next = last;
        }
    }
}
