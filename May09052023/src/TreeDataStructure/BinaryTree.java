package TreeDataStructure;

class Node{
	int item;
	Node right;
	Node left;
	public int data;
	
	public Node(int key) {
		item=key;
		right=left=null;		
	}
}


public class BinaryTree 
{
	//Root of the Binary tree
	
	Node root;
	
	public BinaryTree() {
	    root = null;
	}

	//post order traversal
	void postOrder(Node node) {
	    if(node == null)
	        return;

	    //Traverse Left
	    postOrder(node.left);
	    //Traverse right
	    postOrder(node.right);
	    //Traverse root
	    System.out.println(node.item + "-->");
	}

	//pre order traversal
	void preOrder(Node node) {
	    if(node == null)
	        return;

	    //Traverse root
	    System.out.println(node.item + "-->");
	    //Traverse Left
	    preOrder(node.left);
	    //Traverse right
	    preOrder(node.right);
	}

	//in order traversal
	void inOrder(Node node) {
	    if(node == null)
	        return;

	    //Traverse Left
	    inOrder(node.left);
	    //Traverse root
	    System.out.println(node.item + "-->");
	    //Traverse right
	    inOrder(node.right);
	}

	public static void main(String[] args) 
	{
	    BinaryTree binaryTree = new BinaryTree();

	    //creating nodes of the binary tree
	    binaryTree.root = new Node(1);
	    binaryTree.root.left = new Node(12);
	    binaryTree.root.right = new Node(9);
	    binaryTree.root.left.left = new Node(5);
	    binaryTree.root.left.right = new Node(6);

	    //printing the binary tree in different traversal orders
	    System.out.println("Preorder traversal of binary tree is ");
	    binaryTree.preOrder(binaryTree.root);

	    System.out.println("\nInorder traversal of binary tree is ");
	    binaryTree.inOrder(binaryTree.root);

	    System.out.println("\nPostorder traversal of binary tree is ");
	    binaryTree.postOrder(binaryTree.root);
	}
}