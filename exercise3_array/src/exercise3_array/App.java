package exercise3_array;

import java.util.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws Exception  {
	/* exercise 3
	 * 
		int array1[][] = { {1,2,3,4,5},
						  {6,7,8,5},
						  {11,12,13,14,15},	
						  {16,5,18,19},
						};
		//array a = new array();
		//a.find(array1, 5);
	*/
		
	/* exercise 4	
		String  h = "Hallo World";
		ReplaceBlank  a = new ReplaceBlank();
		String c =a.replace(h);
		System.out.println(a.replace(h));
	*/
		
	/* exercrise 5
	  	ListNode node1 = new ListNode(0);
	  	ListNode node2 = new ListNode(1);
	  	ListNode node3 = new ListNode(2);
	  	ListNode node4 = new ListNode(3);

	    node1.next = node2;
	  	node2.next = node3;
	  	node3.next = node4;
		printListReverse.print(node1);
	*/	
	
	/* exercirse 7 ,have a return problem
	 * 
	 * 
		Queue<Integer>queue = new Queue<Integer>();
		queue.push(0);
		queue.push(1);
		while(!queue.empty()){
			System.out.println(queue.pop());
		}
		queue.push(2);
		queue.push(3);
		System.out.println("Hallo");
		while(!queue.empty()){
			System.out.println(queue.pop());
		}
	*/
	
	/* exercrise 8 
		int array[] = {1,2,3,4,0,5};
		new Rotate(array);
	*/
		
	/* exercrise 9 Fibonacci no test for now
	 * 	
	 */
		
	/* exercrise 10 Number of Bits
	 * 	
	 */
	
	/**execrise 11 Exponent 
	 * 	
	 Exponent a = new Exponent();	
	 //int  b =(int )a.power(10.1, 2);  //output =102;
	// double b =a.power(0, -1); 		//output = 102.00999999999
	 double b1 = a .power(10, 0);
	 double b2 = a .power(10, 1);
	 double b3 = a .power(10, -2);
	System.out.println(b1+b2+b3);
	*/
	
	/** execrise 12 PrintToMax
	 * 
	PrintToMax a = new PrintToMax();
	a.print(3);
	*/	
		
	/** execrise 13 Linked List delete tailNode
	 * 	
	ListNode a = new ListNode(0);
	ListNode b = new ListNode(1);
	ListNode c = new ListNode(2);
	ListNode d = new ListNode(3);
		a.next=b; 
		b.next=c;
		c.next=d;
		b =c;
	System.out.println(b.value);
	DeleteListNode x = new DeleteListNode();
	x.deleteList(a,b);
	System.out.println(a.next.value);
	*/	
	
	/** execrise 14 OddAndEvenNumber
	 * 
		int array[]= new int[]{0,1,2,3,4,5,6,7};		
		OddAndEvenNumber a = new OddAndEvenNumber();
		int b[]=a.sort(array);
		for(int temp : b){
			System.out.println(temp);	
		}
	*/	
		
	/** execrise 15 kLastNode
	 * 	
		ListNode a = new ListNode(0);
		ListNode b = new ListNode(1);
		ListNode c = new ListNode(2);
		ListNode d = new ListNode(3);
		a.next=b; 
		b.next=c;
		c.next=d;
		kLastNode node = new kLastNode();
		System.out.println(node.print(a, 1).value);
	*/	
	
	/** execrise 16 reverseList
	 *  To DO! 
	 */
	
	/** execrise 17 mergeList
	 *  To DO! 
	 */
	 
	/** execrise 18 isTreeIncluded
	 * 	To DO! 
	 */
	
	/** execrise 19 mirror
	 * 	To Do!
	 */
		
	/** execrise 23 PrintBinaryBaum
	 * 	
	 \
		BinaryTreeNode root1=new BinaryTreeNode();  
		BinaryTreeNode node1=new BinaryTreeNode();  
		BinaryTreeNode node2=new BinaryTreeNode();   
		BinaryTreeNode node3=new BinaryTreeNode();   
		BinaryTreeNode node4=new BinaryTreeNode();   
		BinaryTreeNode node5=new BinaryTreeNode();   
		BinaryTreeNode node6=new BinaryTreeNode();
		  
		root1.left=node1;   root1.right=node2;   
		node1.left=node3;   node1.right=node4;   node4.left=node5;   
		node4.right=node6;   root1.value=8;   node1.value=8;   
		node2.value=7;   node3.value=9;   node4.value=2;   node5.value=4;   node6.value=7;
		PrintBinaryBaum print = new PrintBinaryBaum();
		print.print(root1);
	*/	
		
		
	/** execrise 24 Postordner
	 * 	
	
		BinaryTreeNode root1=new BinaryTreeNode();  
		BinaryTreeNode node1=new BinaryTreeNode();  
		BinaryTreeNode node2=new BinaryTreeNode();   
		BinaryTreeNode node3=new BinaryTreeNode();   
		BinaryTreeNode node4=new BinaryTreeNode();   
		BinaryTreeNode node5=new BinaryTreeNode();   
		BinaryTreeNode node6=new BinaryTreeNode();
		  
		root1.left=node1;   root1.right=node2;   
		node1.left=node3;   node1.right=node4;   node4.left=node5;   
		node4.right=node6;   root1.value=8;   node1.value=8;   
		node2.value=7;   node3.value=9;   node4.value=2;   node5.value=4;   node6.value=7;
		
		Postordner print = new Postordner();
		int array[] ={9,4,7,2,8,7,8};
		boolean check = print.check(root1, array);
		System.out.println(check);	
		*/
		
	/**execrise 25 PrintPfadInBinaryTree
	 * 	
	 */
		
		
	}
	
	
	
	
	
	
}
