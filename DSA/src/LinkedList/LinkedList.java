package LinkedList;

public class LinkedList {
	private Node head;
	
	public LinkedList() {
		this.head = null;
	}

	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.insert(1);
		obj.insert(2);
		obj.insert(36);
		obj.insert(45);
		obj.insert(15);
		obj.insert(6);
		
		obj.show();
	}

	private void show() {
		Node current = head;
		while(current.next !=null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	private void insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		} else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

}
