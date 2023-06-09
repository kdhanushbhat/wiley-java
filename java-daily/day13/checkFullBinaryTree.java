package day13;

class BinaryTree{
	Node root;

    public BinaryTree() {
		// TODO Auto-generated constructor stub
    	root = null; 
    }
    
    boolean checkFullBTree(Node root){
    	if(root.right == null && root.left == null)
    		return true;
    	if(root.right!=null && root.left!=null)
    		return checkFullBTree(root.right) && checkFullBTree(root.left);
    	
    	return false;
    }
}

public class checkFullBinaryTree {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.left.right.left = new Node(6);
		bt.root.left.right.right = new Node(7);
		
		if(bt.checkFullBTree(bt.root)) {
			System.out.println("It is a full binary tree");
		} else {
			System.out.println("Not full binary tree");
		}
	}
	
	
}
