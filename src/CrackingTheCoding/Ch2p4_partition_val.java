package CrackingTheCoding;
import CrackingTheCoding.LinkedListNode;

//partition linkedlist around a vaalue x,
//   such that all nodes <x come before all node >=x

public class Ch2p4_partition_val {

	public static void main(String[] args){
	
	
		
	
	}
	
	//Pass the head of linkedlist & value of partition around
	public LinkedListNode partition(LinkedListNode node, int x){
		LinkedListNode beforeStart = null;
		LinkedListNode afterStart = null;
		
		//Partition list
		while(node != null){
			LinkedListNode next = node.next;
			if(node.value < x ){
				node.next = beforeStart;
				beforeStart = node;
			}else{
				node.next = afterStart;
				afterStart = node;
			}
		node = next;	
		}
		
		//merge both the lists
		if(beforeStart == null) return afterStart;
		LinkedListNode head = beforeStart;
		while(beforeStart.next != null){
			beforeStart = beforeStart.next;
		}
		beforeStart.next = afterStart; 
		
		return head;
	}
	
	
	
}
