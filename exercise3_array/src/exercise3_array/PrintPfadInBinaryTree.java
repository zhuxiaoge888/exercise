package exercise3_array;

import java.util.Stack;

public class PrintPfadInBinaryTree {
	
	public void print(int value, BinaryTreeNode root ){
		
		if(root==null)
			return;
		Stack<Integer> stack = new Stack<>();
		int tmp=0;
		print(value, tmp, stack,root);
		
		
		
	}
	
	
	private void print(int value,int tmp,Stack<Integer> stack,BinaryTreeNode root){
		if(root==null){
			return;
		}
		tmp+=root.value;
		stack.push(root.value);
		if(root.left==null&&root.right==null){
			if(tmp==value){
				System.out.println("find a path");
				for(int path:stack){
					System.out.print(path+" ");
				}
				System.out.println();
			}
		}
		if(root.left!=null){
			print(value,tmp,stack,root.left);
		}
		if(root.right!=null){
			print(value,tmp,stack,root.right);
		}
		stack.pop(); 
	}
	
	
}
