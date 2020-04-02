package com.ds.java;

public class ListInJava {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void display(ListNode head) {
		ListNode current = head;
		if (current == null) {
			return;
		}
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println(current);
	}
    public static ListNode insertNodeAtBeggning(ListNode head,int data) {
    	ListNode newNode=new ListNode(data);
    	if(head==null) {
    		return newNode;
    	}
    	newNode.next=head;
    	head=newNode;
    	return head;
    }
    public static ListNode insertNodeAtEnd(ListNode head,int data) {
    	ListNode newNode=new ListNode(data);
    	if(head==null) {
    		return newNode;
    	}
    	ListNode current=head;
    	while(current.next!=null) {
    		current=current.next;
    	}
    	current.next=newNode;
    	return head;
    }
	public static void main(String[] args) {

		ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode four = new ListNode(5);
		head.next = second;
		second.next = third;
		third.next = four;
		display(head);
		ListNode newHead=insertNodeAtEnd(head,15);
		display(newHead);

	}

}
