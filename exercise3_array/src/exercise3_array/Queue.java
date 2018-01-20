package exercise3_array;

import java.util.Stack;

public class Queue<T> {
	public Stack<T>stack1 = new Stack();
	public Stack<T>stack2 = new Stack();
	
	
	public boolean empty(){
		if(stack2==null)
		{
			return true;
		}
		else{ 
			return false;
		}
	}
	
	
	public void push(T tail){
			stack1.push(tail);
	}
	
	public T pop(){
		while(stack2.isEmpty()){
			while(!stack1.empty()){
				stack2.push(stack1.pop());
			}
		}	
		T head =  stack2.pop();
		return head;
	}
}
