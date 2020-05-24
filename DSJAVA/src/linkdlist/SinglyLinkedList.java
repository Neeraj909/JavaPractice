package linkdlist;

public class SinglyLinkedList {

	private Node head;

	public static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node insertNode(int data, Node next) {
		return next;
	}

	// display linkdList
	public static void display(Node head) {
		if (head == null) {
			return;
		}
		Node current = head;

		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print(current);

	}

	// find the size of likedList
	public static int sizeOfList(Node head) {
		if (head == null) {
			return 0;
		}
		Node current = head;
		int count = 0;

		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

	// insert node at Beginning point
	public static Node insertAtBeginningNode(int data, Node head) {
		Node newNode = new Node(data);
		if (head == null) {
			return newNode;
		}
		newNode.next = head;
		head = newNode;
		return head;

	}

	public static Node insertAtTheEnd(int data, Node head) {
		Node newNode = new Node(data);
		if (head == null) {
			return newNode;
		}
		Node Current = head;
		while (Current.next != null) {
			Current = Current.next;
		}
		Current.next = newNode;

		return head;

	}

	//insert node at the given position node
	public static Node insertAtPosition(int position, Node head, int data) {

		int size = sizeOfList(head);
		if (position > size + 1 || position < 1) {
			System.out.println("invalid position");
			return head;
		}
		Node newNode = new Node(data);
		if (position == 1) {
			newNode.next = head;
			return newNode;
		} else {
			Node prev = head;
			int count = 1;
			while (count < position - 1) {
				prev = prev.next;
				count++;
			}
			
			Node current = prev.next;
			newNode.next = current;
			prev.next = newNode;
			head.next=prev;
			return head;

		}
	}
	
	//delete first node
	public static Node detefirstNode(Node head) {
		
		if(head==null) {
			return head;
		}
		Node temp=head;
		head=head.next;
		temp.next=null;
		return temp;
	}

	//delete last node of linkdlist
	
	public static Node deletLastNode(Node head) {
		if(head==null) {
			return head;
		}
		Node last=head;
		Node prevToLast=null;
		while(last.next!=null) {
			prevToLast=last;
			last=last.next;
			
		}
		prevToLast.next=null;
		return last;
	}
	public static void main(String[] args) {
		Node head = new Node(10);
		Node second = new Node(4);
		Node third = new Node(5);
		Node fourth = new Node(6);
		Node fifth = new Node(7);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		display(head);
		System.out.println();
		System.out.println(sizeOfList(head));
		Node bigNode = insertAtBeginningNode(20, head);
		display(bigNode);
		System.out.println();
		bigNode = insertAtTheEnd(11, head);
		display(bigNode);
		bigNode = insertAtPosition(3, bigNode, 78);
		System.out.println();
//		display(bigNode);
//		bigNode=detefirstNode(bigNode);
//		System.out.println(bigNode.data);
//		display(bigNode);
		bigNode = deletLastNode(head);
		System.out.println();
		display(bigNode);
		

	}

}
