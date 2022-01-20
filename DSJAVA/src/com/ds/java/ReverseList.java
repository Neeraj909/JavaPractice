public class SinglyLinkedList {
	private static Node head;

	private static class Node {
		private Node next;
		private int data;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void displaySinglyLinkedList() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + "-->");
				current = current.next;
			}
			System.out.print("null");
		}
	}

	public static int findLengthOfList() {
		Node current = head;
		int count = 0;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public static void insertAtTheBeginningAtList(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node current = new Node(data);
			current.next = head;
			head = current;

		}
	}

	public static void insertAtTheEndAtList(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node newNode = new Node(data);
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;

		}
	}

	public static void inertNodeAtGivenPosition(int data, int pos) {
		Node newNode = new Node(data);
		if (pos == 1) {
			newNode.next = head;
			head = newNode;
		} else {
			Node prev = head;
			int count = 1;
			while (count < pos - 1) {
				prev = prev.next;
				count++;
			}
			Node current=prev.next;
			newNode.next=current;
			prev.next=newNode;

		}
	}
	public static void reverseList(){
		Node current=head;
		Node prev=null;
		Node next=null;
		while (current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;

	}

	public static void main(String[] args) {
		head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		head.next = second;
		second.next = third;
		third.next = fourth;
		displaySinglyLinkedList();
		System.out.println();
//         System.out.println(findLengthOfList());
//        insertAtTheEndAtList(5);
//        displaySinglyLinkedList();
//        inertNodeAtGivenPosition(1, 1);
//        inertNodeAtGivenPosition(2, 2);
//        displaySinglyLinkedList();
		reverseList();
		displaySinglyLinkedList();

	}
}
