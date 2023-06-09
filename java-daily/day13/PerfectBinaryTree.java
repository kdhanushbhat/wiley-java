package day13;

public class PerfectBinaryTree {

	
	static int depth(Node node) {
		int d = 0;
		while(node != null) {
			d++;
		}
		return d;
	}
	
	static boolean isPerfect(Node root, int d, int level) {
		if(root == null)
			return true;
	
		if(root.left == null && root.right == null)
			return (d==level+1);
		
		if(root.left == null || root.right == null)
			return false;
		
		return isPerfect(root.left, d, level+1) && isPerfect(root.right, d, level+1);
		
	}
	
	static boolean isPerfect(Node root) {
		int d =depth(root);
		return isPerfect(root,d,0);
	}
	
	static Node newNode(int k) {
		Node node = new Node(k);
		return node;
	}
	
	public static void main(String[] args) {
		Node rootNode = newNode(1);
		rootNode.left = newNode(2);
		rootNode.right = newNode(3);
		rootNode.left.left = newNode(4);
		rootNode.left.right = newNode(5);
		rootNode.right.left = newNode(6);
		rootNode.right.right = newNode(7);
		System.out.println("hello");
		if(isPerfect(rootNode))
			System.out.println("Perfect Binary Tree");
		else {
			System.out.println("Not a perfect Binary tree");
		}
	}
}
