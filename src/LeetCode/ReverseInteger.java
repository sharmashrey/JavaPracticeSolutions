package LeetCode;

public class ReverseInteger {

	public int reverse(int x) {
        int neg =0;
        int y=0;
        y=x;
        
        long result=0;
        
        while(y!=0){
            int temp = y%10;    
            result = result *10 +temp;
	            if(result> Integer.MAX_VALUE || result < Integer.MIN_VALUE){
	                return 0 ;
	            }
            y = y/10;
        }
    
    result = result  +y;
    return (int)result;
    }
}
