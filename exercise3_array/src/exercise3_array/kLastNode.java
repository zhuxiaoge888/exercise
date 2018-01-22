package exercise3_array;

public class kLastNode {
	
	public ListNode print(ListNode headNode, int k){
		ListNode node = headNode;
		int count=1;
		while(node.next!=null){
			node = node.next;
			count++;
		}
		
		if(count==k){
			return headNode;
		}
		
		ListNode newNode = headNode;
		for(int i =0; i<count-k;i++){
			newNode = newNode.next;
		}
		return newNode;
		
	}
	
	
	
}
