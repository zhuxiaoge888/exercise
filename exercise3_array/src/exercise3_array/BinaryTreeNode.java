package exercise3_array;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeNode {
	BinaryTreeNode left;
	BinaryTreeNode right;
	int value;
	
	public boolean hasleft(){
		if(this.left!=null) return true;
		return false;
		
	}
	
	public boolean hasright(){
		if(right!=null) return true;
		return false;
		
	}
	
	
}
