package TreeDataStructure;

//check the given tree is full binary tree or not

class NodeClass{
	int data;
	NodeClass left;
	NodeClass right;
	
	public NodeClass(int item) {
		data=item;
		left=right=null;
	}
}
public class FullBinaryTree {
	NodeClass root;
	
	//Method to check for full binary tree
	boolean isFullBinaryTree(NodeClass node) {
		
		//checking root emptiness
		if(node==null)
			return true;
		
		//Checking the children
		if(node.left==null && node.right==null)
			return true;
		
		if(node.left!=null && node.right!=null)
			return (isFullBinaryTree(node.left) && isFullBinaryTree(node.right));
		return false;
		
	}

	public static void main(String[] args) {
		FullBinaryTree fb=new FullBinaryTree();
		fb.root=new NodeClass(1);
		fb.root.left=new NodeClass(2);
		fb.root.right=new NodeClass(3);
		fb.root.right.left=new NodeClass(7);
		fb.root.left.left=new NodeClass(4);
		fb.root.left.right=new NodeClass(5);
		fb.root.left.right.left=new NodeClass(6);
		fb.root.left.right.right=new NodeClass(7);
		
		if(fb.isFullBinaryTree(fb.root))
		System.out.println("The tree is a full binary tree");
		else
		{
			System.out.println("Tree is not a full binary tree");
		}
		
		
		
		

	}

}
