package Tree;

public class BinarySearchTree {
	
	Node root;

	public void insert(int data) {
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
		} else {
			insertWithRec(root, newNode);
		}
		
	}

	private Node insertWithRec(Node current, Node newNode) {
		if(current==null) {
			return newNode;		
		}
		if(current.data > newNode.data) {
			current.left = insertWithRec(current.left, newNode);
		} else if(current.data < newNode.data){
			 current.right = insertWithRec(current.right, newNode);
		}
		return current;
	}

	public void show() {
		show(root);		
	}

	private void show(Node current) {
		if(current.left != null) {
			show(current.left);
		}
		if (current.right != null) {
			show(current.right);
		}
		System.out.println(current.data);
	}

}
