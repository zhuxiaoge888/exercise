package exercise3_array;

import java.util.ArrayList;
import java.util.List;

public class Postordner {
	List<Integer> list = new ArrayList<>();
	public boolean check(BinaryTreeNode root, int array[]){
		
		post(root);
			
			
		for(int i=0; i<list.size();i++){
			if(list.get(i)!=array[i])
				return false;
		}
			
		
		return true;
	}
	
	private void post(BinaryTreeNode root){
		if(root!=null){
			post(root.left);
			post(root.right);
			list.add(root.value);	
		}	
	}
	
	
}
