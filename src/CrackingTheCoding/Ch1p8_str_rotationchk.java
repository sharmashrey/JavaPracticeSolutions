package CrackingTheCoding;

public class Ch1p8_str_rotationchk {
	public static void main(String[] args){
		
	}
	
	public static boolean isRotation(String str1, String str2){
		int length = str1.length();
		if(length == str2.length()&& length>0){
			String s1s1 = str1+str1;
			return isSubstring(s1s1,str1);
		}
		return false;	
	}
	
	public static boolean isSubstring(String str1,String str2){ return false;}
	
}
