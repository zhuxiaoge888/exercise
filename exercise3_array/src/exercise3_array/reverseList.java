package exercise3_array;

public class reverseList {
	public void reverse(ListNode headNode){
		
		ListNode nowNode = headNode;
	    ListNode afterNode = headNode.next;
	    ListNode afterAfterNode = afterNode.next;
		while(afterNode.next!=null){
			
			afterAfterNode = afterNode.next;
			afterNode.next = nowNode;
			nowNode = afterNode;
			afterNode = afterAfterNode ;
			
		}	
			
			
		
			
		
	}
}
