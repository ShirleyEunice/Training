package TreeDataStructure;

//Checking if the binary tree is complete binary tree or not

//Node creation

class Node2
{
	int item;
	Node2 left;
	Node2 right;

	public Node2(int key) 
	{
		item=key;
		right=left=null;
	}
}
public class CompleteBinaryTree 
{
	Node2 root;
	
	//Count number of nodes
	int countNode(Node2 root) 
	{
		if(root==null)
			return 0;
		return (1+countNode(root.left) + countNode(root.right));
	}
	
	//Check for the complete Binary Tree
	boolean checkComplete(Node2 root, int index,int numberNodes) 
	{
		
		//check tree is empty
		if(root==null)
			return true;
		
		if(index>=numberNodes)
			return false;
		
		return (checkComplete(root.left,2*index+1,numberNodes)&&
				checkComplete(root.right,2*index+1,numberNodes));
	}

	public static void main(String[] args) 
	{
		CompleteBinaryTree cb=new CompleteBinaryTree();
		cb.root=new Node2(1);
		cb.root.left=new Node2(2);
		cb.root.right=new Node2(3);
		cb.root.left.left=new Node2(4);
		cb.root.left.right=new Node2(5);
		cb.root.right.left=new Node2(6);
		
		int cNode=cb.countNode(cb.root);
		int index=0;
		
		if(cb.checkComplete(cb.root, index,cNode)) {
			System.out.println("The given tree is complete binary tree");
		}
			else
			{
				System.out.println("The given tree is not a complete binary tree");
			}
		}
		

}
