package exercise3_array;

public class DeleteListNode {

	public void deleteList(ListNode headNode, ListNode tailNode) throws Exception{
		if(headNode == tailNode){
			headNode = null;
			return;
		}
		
		if(headNode==null){
			throw new Exception("no sense with null headNode");
		}
		
		if(headNode.next==null){
			headNode = null;
			return;
		}
		
		if(tailNode.next==null){
			ListNode node = headNode;
			while(node.next.next!=null){
				node = node.next;	
			}
			node.next=null;
		return;
		}
		tailNode.value = tailNode.next.value;   
		tailNode.next = tailNode.next.next;
		//tailNode = tailNode.next;			Why not?
	}
}
