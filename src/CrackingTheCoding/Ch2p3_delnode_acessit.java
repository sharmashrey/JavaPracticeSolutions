package CrackingTheCoding;
import CrackingTheCoding.LinkedListNode;

public class Ch2p3_delnode_acessit {

	//delete a node given access only to that node 
	
	public static void main(String[] args){
	
		LinkedListNode delNode = new LinkedListNode(0,0,null);
		del_node(delNode);
	}
	
	//Copy the next node to a previous node and delete it
	//NOTE: cannot delete a node if the node is last node	
	public static boolean del_node(LinkedListNode delNode){
		if(delNode == null|| delNode.next == null ) return false;
		
		LinkedListNode nextNode = delNode.next;
		delNode.value = nextNode.value;
		delNode.next = nextNode.next;
		return true;
	}
	
}
