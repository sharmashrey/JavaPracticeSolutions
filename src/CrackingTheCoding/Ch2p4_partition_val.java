package CrackingTheCoding;
import CrackingTheCoding.LinkedListNode;

//partition linkedlist around a vaalue x,
//   such that all nodes <x come before all node >=x

public class Ch2p4_partition_val {

	public static void main(String[] args){
	LinkedListNode beforeStart = null;
	LinkedListNode afterStart = null;
	
	
	
	
	}
	
	//Pass the head of linkedlist & value of partition around
	public LinkedListNode partition(LinkedListNode node, int x){
		
		//Partition list
		while(node != null){
			LinkedListNode next = node.next;
			if(next.value < x ){
				node.next = beforeStart;
				beforeStart = node;
				
			}else{
				
			}
			
			
		}
		return null;
	}
	
	
	
}
