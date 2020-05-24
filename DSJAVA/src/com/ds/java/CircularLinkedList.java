package com.ds.java;

public class CircularLinkedList {

	static class Node {
		int data;
		Node next;
	}

	static boolean isCircular(Node head) {
		if (head == null) {
			return true;
		}
		Node node = head.next;
		while (node != null && node != head)
			node = node.next;
		return (node == head);
	}

	static Node newNode(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		return temp;
	}

	    public static boolean isCircula12r(Node node) {
	        Node first = node, second = node;
	 
	        while (first != null && first.next != null && second.next != null && second.next.next != null) {
	            first = first.next;
	            second = second.next.next;
	            if (first.hashCode() == second.hashCode()) {
	                return true;
	            }
	        }
	 
	        return false;
	    }
	
	public static void main(String args[]) {
		Node head = newNode(1);
		head.next = newNode(2);
		head.next.next = newNode(3);
		head.next.next.next = newNode(4);
		System.out.print(isCircular(head) ? "Yes\n" : "No\n");
		head.next.next.next.next = head;
		System.out.print(isCircula12r(head) ? "Yes\n" : "No\n");
	}
}
