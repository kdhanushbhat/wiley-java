package day13;


public class BST {
	Node root;
	BST(){
		root = null;
	}
	public boolean searchBST(Node root,int x) {
		if(root == null)
			return false;
		if(root.val == x)
			return true;
		if(root.val > x) {
			return searchBST(root.left, x);
		}
		return searchBST(root.right, x);
	}
	
	public Node insert(Node root, int val) {
	    if (root == null) {
	        root = new Node(val);
	        System.out.println("added");
	        return root;
	    }
	    System.out.println(root.val);
	    if (root.val == val)
	        return root;
	    if (val > root.val) {
	        System.out.println("right");
	        root.right = insert(root.right, val);
	    } else {
	        System.out.println("left");
	        root.left = insert(root.left, val);
	    }
	    return root;
	}

	
	
	public void printSructure(Node node) {
		if (node == null) {
            return;
        }
		printSructure(node.left);
        System.out.println(node.val + " ------------");
        printSructure(node.right);
	}
	
	public static void main(String[] args) {
		BST bt = new BST();
		bt.root = new Node(8);
		bt.root.left = new Node(3);
		bt.root.right = new Node(10);
		bt.root.left.left = new Node(1);
		bt.root.left.right = new Node(6);
		bt.root.left.right.left = new Node(4);
		bt.root.left.right.right = new Node(7);
		bt.root.right.right = new Node(14);
		bt.root = bt.insert(bt.root, 5);
//		if(bt.searchBST(bt.root, 5)) {
//			System.out.println("Present");
//		} else {
//			System.out.println("Absent");
//		}
		
		bt.printSructure(bt.root);
		//System.out.println(bt.root);
	}
}
