package CrackingTheCoding;

import java.util.Hashtable;
import CrackingTheCoding.LinkedListNode;

public class Ch2p1_rmv_duplicates {

	public static void main(String[] args) {
		
		//head of linkedList
		LinkedListNode head = createLinkedList();
		
		//remove duplicates in the LinkedList
		removedup();
	}
	
	public static LinkedListNode createLinkedList(){
		
		
		LinkedListNode head =new LinkedListNode(0,0,null);
		LinkedListNode first =new LinkedListNode(0,0,null);
		LinkedListNode prevNode = new LinkedListNode(0,0,null);
		head.next = first;
		
		
		for(int i=0;i<10;i++){
			
			LinkedListNode newNode = new LinkedListNode(i,i+2,null);
			prevNode.next = newNode;
			prevNode = newNode;
			
		}
		
		return head;
	}
	
	public static void removedup(){
		
	}

}
