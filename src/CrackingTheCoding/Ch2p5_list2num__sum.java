package CrackingTheCoding;

//two numbers are reprsented in linked list , where list stores numbers in reverse order
// i.e, one's number is at head . add both numbers to get sum,return sum linked list


public class Ch2p5_list2num__sum {
	
	public static void main(String[] args){
		
	}
	
	//own solution - 
	public LinkedListNode sumTwoNumberList(LinkedListNode l1,LinkedListNode l2, int carry){
	
		LinkedListNode node1= l1;
		LinkedListNode node2= l2;
		LinkedListNode newlisthead = null;
		
		//traverse both the lists
		while(node1 != null || node2 != null){
			int tempnum =0;
			int tempunit=0;
			if(node1 != null){ tempnum += node1.value;
				node1=node1.next;
			}
			if(node2 != null){ tempnum += node2.value;
				node2=node2.next;
			}
			tempunit = tempnum%10;
			LinkedListNode tempptr = newlisthead;
			while(tempptr !=null){
				tempptr = tempptr.next;
			}
		}
		
		
		return newlisthead;
	}
}
