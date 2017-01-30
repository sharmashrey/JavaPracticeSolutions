package CrackingTheCoding;

import java.util.Hashtable;
import CrackingTheCoding.LinkedListNode;

//algorithm to find kth to last element of a singly linked list
//1. traverse the linkedlidt ,get the length, traverse second time for (n-k) times
//2. use two pointers, initial and last,start the last k traversals after first.

public class Ch2p2_find_kth_tolast {

	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(0,0,null);
		int k = 5;
		kth_to_last(head, k);
	}
	
	//recursion
	//Space complexity: O(n)
	public static int kth_to_last(LinkedListNode head, int k){
		//base case 
		if(head == null)return 0;
		
		int i= kth_to_last(head.next,k) + 1;
	
		if(i ==k ){System.out.println(head.value);}
			
		return i;
	}
	
	//Iterative solution: 2 pointers,placed k nodes apart & move at same pace.
	//Space complexity: O(n)
	//Time complexity : O(1)
	public static LinkedListNode kth_to_last_itr(LinkedListNode head, int k ){
		//boundary condition
		if(k <=0) return null;
		
		LinkedListNode p1 = new LinkedListNode(0,0,null);
		LinkedListNode p2 = new LinkedListNode(0,0,null);
		int counter=0;
		p1= head;
		p2=head;
		
		for(int i =0; i< k; i++){
			p1 = p1.next;
		}
		
		//start moving both pointers at same speed
		while(head != null){
			p1= p1.next;
			p2= p2.next;
		}
		
		//print the lagging pointer 
		System.out.print(p2.value);	
		return p2;
	}
}
