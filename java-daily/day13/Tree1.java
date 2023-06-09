package day13;


class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
    
    @Override
    public String toString() {
    	return "Value: "+this.val+"["+this.left+", "+this.right+"]";
    }
}

public class Tree1 {
    Node root;

    public Tree1() {
        root = null;
    }

    public void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.val + " ------------");
        inOrderTraversal(node.right);
    }

    public void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val + " ------------");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.val + " ------------");
    }
    
    public static void main(String[] args) {
        Tree1 tree = new Tree1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("In-order traversal:");
        tree.inOrderTraversal(tree.root);

        System.out.println("Pre-order traversal:");
        tree.preOrderTraversal(tree.root);

        System.out.println("Post-order traversal:");
        tree.postOrderTraversal(tree.root);
    }
}
