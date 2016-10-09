import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner in = new Scanner(System.in);
	//	int testcase = in.nextInt();
		
	//	for(int i =0;i<testcase; i++x){
		    int arrsize = in.nextInt();
		    int[] intarray = new int[arrsize];
		    int sumreq =  in.nextInt();
		    
		    for(int j=0;j<arrsize ;j++){
		        intarray[j]= in.nextInt();
		     
		    }
		    
		    boolean present = false;
		    for(int j=0;j<arrsize;j++){
    		     for(int k=j+1 ;k<arrsize;k++){
    		     if( (intarray[k] +intarray[j]) == sumreq){
    		         present = true;
    		     }
    		        
    		    }
		        
		    }
		    
		    if(present){
		        System.out.println("Yes");
		    }else System.out.println("No");
		    
		    
		    //get sum and print 
		    
		    
		    
	//	}
		
	}
}