package Trees;
/*This program is asked in programming interview.
 * To check the subtree the best solution is to create recursive solution and traverse if node matches then check 
 * correspondent values of tree nodes otherwise traverse through bigger tree
 * 
 * 
 */
public class SubTreeCheck {
	
	public static void main(String[] args)
	{
		NodeTree root=new NodeTree(26);
		root.left=new NodeTree(10);
		root.right=new NodeTree(3);
		root.left.left=new NodeTree(4);
		root.left.right=new NodeTree(6);
		root.left.left.right=new NodeTree(30);
		root.right.right=new NodeTree(3);
		
		NodeTree root1=new NodeTree(10);
		root1.left=new NodeTree(4);
		root1.right=new NodeTree(6);
		root1.left.right=new NodeTree(30);
		System.out.println(verifySubTree(root,root1));
		
	}
	
	public static boolean verifySubTree(NodeTree root,NodeTree root1)
	{
		if(root1==null)
			return true;
		if(root==null)
			return false;
		if(root.value==root1.value)
		{
			return verifySubTree(root.left,root1.left) && verifySubTree(root.right,root1.right);
		}
		else{
		return (verifySubTree(root.left,root1) || verifySubTree(root.right,root1)); //traverse bigger tree,sub tree can be on left or right part also
	}
	

}
}

class NodeTree
{
	NodeTree left;
	NodeTree right;
	int value;
	NodeTree(int x)
	{
		value=x;
		left=right=null;
	}
}
