package TreeDataStructure;

class Node3{
	int data;
	Node3 left;
	Node3 right;
	
	Node3(int item){
		item=data;
		right=left=null;
	}
}

//calculate height
class Height{
	int height=0;
}

public class BalancedTree {
	Node3 root;
	
	//check height balance
	boolean checkHeight(Node3 root, Height height) {
		
		//check for emptiness
		if(root==null) {
			height.height=0;
			return true;
		}
		
		Height leftHeight=new Height(),rightHeight=new Height();
		
		boolean l=checkHeight(root.left,leftHeight);
		boolean r=checkHeight(root.right,rightHeight);
		
		int lh=leftHeight.height;
		int rh=rightHeight.height;
		
		height.height=(lh>rh ?lh:rh)+1;
		if(lh-rh>=2 || (rh-lh>=2)) {
			return false;
		}else			
		return l && r;
	}

	public static void main(String[] args) {
		Height height=new Height();
		
		BalancedTree bt=new BalancedTree();
		
		bt.root=new Node3(1);
		bt.root.left=new Node3(2);
		bt.root.right=new Node3(3);
		bt.root.left.left=new Node3(4);
		bt.root.left.right=new Node3(5);
		//bt.root.right.right=new Node3(6);
		
		if(bt.checkHeight(bt.root, height))
		{
		System.out.println("The given tree is a balanced tree");	
		}else
		{
			System.out.println("The given tree is a unbalanced tree");
		}
	}

}
