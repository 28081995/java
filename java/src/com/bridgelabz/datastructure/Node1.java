package com.bridgelabz.datastructure;

	public class Node1<T> {
		public T data;
		public Node1 prev;
		public Node1 next;
		protected Node1 link;
	    public Node1 top;
		public Node1(T data) {
			this.data = (T) data;
		}

		public Node1(T data, Node1 prev, Node1 next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}

		public Node1(T data, Node1 link) {
			this.data = data;
			this.link = link;
		}

		/**
		 * @return the data
		 */
		public T getData() {
			return data;
		}

		/**
		 * @param data
		 *            the data to set
		 */
		public void setData(T data) {
			this.data = data;
		}

		public void setLink(Node1 n) {
			link = n;
		}

		public Node1 getLink() {
			return link;
		}
	}

