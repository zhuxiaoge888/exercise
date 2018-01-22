package exercise3_array;

public class isTreeIncluded {
	
	public boolean treeIncluded(BinaryTreeNode root1, BinaryTreeNode root2 ){
		
		boolean result = false;
		if(root1 == null){
			return false;
		}
		
		if(root2== null){
			return true;
		}
		
		if(root1.value == root2.value){
			result = isATreeB(root1,root2);
			if(!result)
				result=treeIncluded(root1.left,root2);
			if(!result)
				result=treeIncluded(root1.right,root2);
		}
		
		else{
			result=treeIncluded(root1.left,root2);
			if(!result)
				result=treeIncluded(root1.right,root2);			
			
		}
		
		
		
		return result;
		
	}
	
	public boolean isATreeB(BinaryTreeNode root1, BinaryTreeNode root2){
		
		if(root2 ==null){
			return true;
		}
		
		if(root1==null){
			return false;
		}
		
		if(root1.value!=root2.value){
			
			return false;
		}
		
		isATreeB(root1.left,root2.left);
		isATreeB(root1.right,root2.right);
		return true;
	}
	
}
