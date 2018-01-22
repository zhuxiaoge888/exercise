package exercise3_array;

public class mirror {
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	public void print(BinaryTreeNode root){
		
		if(root.left!=null || root.right!=null){
			spiegel(root);
			print(root.left);
			print(root.right);
		}
		return;
	}
	
	public void spiegel(BinaryTreeNode root){	
		
		left = root.left;
		root.left = root.right;
		root.right = left;
	}
}
