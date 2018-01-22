package exercise3_array;

public class mergeList {
	
	
	public ListNode merge(ListNode headNode1, ListNode headNode2){
		if (headNode1 == null){
			return headNode2;
		}

		if (headNode2 == null){
			return headNode1;
		}
		
		ListNode mergeHead = null;
		if(headNode1.value<headNode2.value){
			mergeHead = headNode1;
			mergeHead.next = merge(headNode1.next, headNode2);
		}
		
		else{
			mergeHead = headNode2;
			mergeHead.next = merge(headNode1, headNode2.next);
		}
		return mergeHead;
		
	}
	
	
	
}
