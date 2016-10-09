package CrackingTheCoding;

public class TreeBalancCheck {

	
	//1.  f(x) to check if tree is balanced.
	//defn:- balanced tree is such that no two leaf nodes differ in distance from r$

	public static int maxDepth(TreeNode root){
	        if(root == null) return 0; //base consdition for no tree
	        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right)) ;
	}

	public static int minDepth(TreeNode root){
	        if(root == null) return 0;
	        return  1+ Math.min(minDepth(root.left), minDepth(root.right) );
	}

	public boolean checkbalanced(TreeNode root){
	        if((maxDepth(root) - minDepth(root)) <= 1){
	                return true ;}
	        else return false;
	}

	
	
}
