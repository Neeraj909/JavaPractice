package com.ds.java;

public class ReversLinkedListGroupOfNode {

	static class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		public void print() {
			Node ptr = this;
			while (ptr.next != null) {
				System.out.print(ptr.data + " -> ");
				ptr = ptr.next;
			}
			System.out.println(ptr.data);
		}
	};

	public static Node reverseInGroups(Node head, int k) {

		if (head == null) {
			return null;
		}

		Node current = head;

		// reverse next k nodes
		Node prev = null;
		int count = 0;

		while (current != null && count++ < k) {

			Node next1 = current.next;
			current.next = prev;

			prev = current;

			current = next1;
		}

		head.next = reverseInGroups(current, k);

		return prev;
	}

	public static void main(String[] args) {
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = reverseInGroups(head, 3);
		head.print();
	}
}
