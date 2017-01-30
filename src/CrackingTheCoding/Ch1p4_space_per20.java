package CrackingTheCoding;

public class Ch1p4_space_per20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chararray = {'N','e','w',' ','S','t','r','i',' ','n','g'};
		replaceSpaces(chararray);
	}
	
	//one scan: count whitespaces ;2 scan: 
	public static char[] replaceSpaces(char[] chararray){
		System.out.println("hwew");
		
		int whitespaces =0, newLength,i ;
		for( i =0;i < chararray.length-1;i++ ){
			if(chararray[i] == ' ') whitespaces++;
			}
		System.out.println(chararray);
			newLength= whitespaces*2 + chararray.length;
			chararray[newLength]='\0';
			System.out.println(chararray);
			
			//move the chararray forward by 2 characters
			for(int j= chararray.length -1 ;j>0; j--){
				if(chararray[i]== ' '){
					chararray[j-1]='0';
					chararray[j-2]='2';
					chararray[j-3]='%';
					newLength = newLength-3;	
				}else{
					chararray[newLength-1]=chararray[j];
					newLength= newLength-1;
				}
				
			}
			
		
		return chararray;
	}
}
