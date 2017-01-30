package CrackingTheCoding;

public class Ch1p1_str_uniqchar {

//	& <-- verifies both operands
//	&& <-- stops evaluating if the first operand evaluates to false since the result will be false


	public static void main(String[] args) {
		String tempchar = "TohTles";
		
		System.out.println("The string has unique characters : "+ checkUnique2(tempchar)); 	
	}
	/*ways to solve :- 
	 first ask whether values are in ASCII or UNICODE string
	  */
	 
	// boolean array : complexity O(n) ; space complexity O(1)
	public static boolean checkUnique (String str){
		//failure: if total char length is more than 128 characters,to check for repeats
		 	if(str.length() > 128) return false;
		
		//check from boolean array 
		boolean[] chararray = new boolean[128];  	
		for(int i=0; i< str.length(); i++){
			int value = str.charAt(i);
			if(chararray[value]){
				return false;
			}
			chararray[value] = true;
		}
		return true;
	}
	
	//Bitwise: complexity O(n) ;space O(1)
	/*based on idea of utilising bits in an int
	 * Since an int has 32 bits,but there are only 26 characters in alphabets
	 * Therefore mark each bit that has already appeared as 1 in the int value. 
	 * */
	 
	public static boolean checkUnique2(String str){
		if(str.length()>128)return false; 
		int strbitint =0;
		
		for(int i=0;i<str.length();i++){
			int bitvalue = str.charAt(i)- 'a';
			if ((strbitint & (1 << bitvalue)) > 0 ){
				//1 << bitvalue creates, nth bit value valid
				return false;
			}
			//copy the whole bit values if even 1 bit is added
			strbitint |= (1<<bitvalue);
		}
		return true;
	}

}
