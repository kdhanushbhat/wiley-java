package day13;


public class CompleteBinaryTree {
	Node root;

    public CompleteBinaryTree() {
        root = null;
    }
    
    public int countNodes(Node root) {
    	if(root == null)
    		return 0;
    	return 1+countNodes(root.left)+countNodes(root.right);
    }
    
    public boolean completeCheck(Node root, int index, int nodeCount) {
    	if(root==null) {
    		return true;
    	}
    	if(index>=nodeCount) {
    		return false;
    	}
    	return completeCheck(root.left, (2*index+1), nodeCount) && completeCheck(root.right, (2*index+2), nodeCount);
    	
    	
    }
    
    public static void main(String[] args) {
		CompleteBinaryTree rootNode = new CompleteBinaryTree();
		rootNode.root = new Node(1);
		rootNode.root.left = new Node(2);
		rootNode.root.right = new Node(3);
		rootNode.root.left.left = new Node(4);
		rootNode.root.left.right = new Node(5);
		rootNode.root.right.left = new Node(6);
		rootNode.root.right.right = new Node(7);
		
		int count = rootNode.countNodes(rootNode.root);
		if(rootNode.completeCheck(rootNode.root, 0, count)) {
			System.out.println("Complete");
		} else {
			System.out.println("Not complete");
		}
	}
}
