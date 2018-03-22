package exercise3_array;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root = new BinaryTreeNode();
		root.value = 1;
		BinaryTreeNode left = new BinaryTreeNode();
		left.value = 2;
		root.left = left;
		BinaryTreeNode right = new BinaryTreeNode();
		right.value=3;
		root.right = right;
		//System.out.println(root.left.value);
		left.value = 4;
		//System.out.println(root.left.value);
		
		List a = new ArrayList<>();
		
		a.add(0);
		a.add(0);
		System.out.println(a);
		
	}

}
