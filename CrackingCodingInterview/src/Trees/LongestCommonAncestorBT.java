package Trees;
/* The meaning of LCA is Longest common ancestor in Binary tree as example
 *   						1
 *   					   / \
 *                        2   3
 *                       /\
 *                       4 5
 *   In this example the LCA of 4 and 5 is to 2 and LCA of 2 and 3 is 1
 *   The solution for this example is the recursive solution of the tree pass the element in recursive function find left 
 *   and right elements
 
 */
public class LongestCommonAncestorBT {
	
	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		Node x=LCA(root,3,7);
		System.out.println(x.value);
	}
	// start is the value of first node and end is value of second node
	public static Node LCA(Node root,int start,int end)
	{
		Node left=null;
		Node right=null;
		
		if(root==null)
			return null;
		// this function is for going into left or right subtree if values do not lie into left or right then return root
		left=LCA(root.left,start,end);
		right=LCA(root.right,start,end);
		
		if(left!=null && right!=null)
		{
			return root;
		}
		return (left!=null)?left:right; //this statement shows if two nodes lie in left or right part it will return node
		
	}

}

class Node
{
	Node left;
	Node right;
	int value;
	Node(int d)
	{
		left=right=null;
		value=d;
	}
}