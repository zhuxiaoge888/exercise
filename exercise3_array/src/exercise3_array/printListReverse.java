package exercise3_array;

import java.util.Stack;

public class printListReverse {
	
	public static void print(ListNode node){
		if(node==null){
			return;
		}
		
		Stack<ListNode>stack = new Stack<ListNode>();
		
		while(node!=null){
		  stack.push(node);	
		  node = node.next;
		}
		
		while(!stack.empty()){
		 ListNode nextNode = stack.pop();
		 System.out.println(nextNode.getValue());
		}
		System.out.println("End");
	}
	
	
}
