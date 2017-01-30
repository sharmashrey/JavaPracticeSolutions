package CrackingTheCoding;
//sample- aaabbaa -> a3b2a2

public class Ch1p5_str_compresn {
	

	public static void main(String[] args){
		String str = "aabccccdeee";
		System.out.print(compressAlternate(str));
	}
	
	//runtime complexity : O(p+k^2)
	//where k = number of sequences,  since string concatenation takes
	public static String compresstr(String str){
		
		char strchar = str.charAt(0);
		char prevchar = str.charAt(0);
		int counter=1;
		int charcounter =1;
		String finstr="";		
		for(int i=1;i<str.length();i++ ){	
			if(str.charAt(i) == prevchar){
				counter++;				
			}
			else{			
				charcounter++;
				finstr += prevchar+""+counter;
				prevchar = str.charAt(i);
				counter=1;
				if(i == str.length()-1 ){ 
				finstr+= prevchar+""+counter;
				}
			}		
		}
		if(charcounter *2  > str.length() ) return str;
		return finstr;
	}
	
	//use StringBuffer
	public static String compresstr2(String str){
		if(compresscounter(str) > str.length() )return str;
		
		StringBuffer strbuff = new StringBuffer();
		char last = str.charAt(0);
		int count= 1;
		for (int i=1;i<str.length();i++){
			if(str.charAt(i) == last){
				count++;
			}else{
				strbuff.append(last);
				strbuff.append(count);
				last = str.charAt(i);
				count=1;
			}
		}
		//for the last character
		strbuff.append(last);
		strbuff.append(count);
		//convert StringBuffer to String when returning
		return strbuff.toString();
	}
	
	//Alternate : Use char array
	//complexity :  space O(n) , time: O(n)
	public static String compressAlternate(String str){
		//base check: if compressed string is smaller than string then proceed
		if(compresscounter(str) > str.length() )return str;
		
		char[] chararray = new char[compresscounter(str)];
		char prev = str.charAt(0);
		chararray[0]= prev;
		char alphabet=prev;
		int alphabetpostn=0;
		int alphcount=1;
		for(int i=1;i<str.length();i++){
			if(prev == str.charAt(i)){alphcount++; 
				if(i== str.length()-1){
					chararray[alphabetpostn] = prev;
					//chararray[alphabetpostn] = String.valueOf(alphcount).toCharArray() ;
				}
			}
			else{
				chararray[alphabetpostn] = prev;
				chararray[alphabetpostn] = (char)alphcount;
				prev= str.charAt(i);
				alphabetpostn+=2;
				alphcount =1;
			}
		}
		
		return chararray.toString();
	}
	
	//count length of string after compression
	public static int compresscounter(String str){
		int complength = 1;
		char prev = str.charAt(0);
		
		for(int i=0; i<str.length() ;i++){
			if(str.charAt(i) == prev){
			}
			else{ prev = str.charAt(i);
				++complength;}
		}
		
	return complength*2;	
	}	
}
