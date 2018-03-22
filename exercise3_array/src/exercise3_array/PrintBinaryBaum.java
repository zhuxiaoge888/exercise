package exercise3_array;

public class PrintBinaryBaum {
	
	public void print(BinaryTreeNode root){
		
		Queue<BinaryTreeNode> queue = new Queue<>(); 
		queue.push(root);
		while(!queue.empty()){
			BinaryTreeNode node = queue.pop();
			System.out.println(node.value);
		
			if(node.hasleft())
				queue.push(node.left);
			if(node.hasright()) 
				queue.push(node.right);
		}
	}
	
	
	
}
