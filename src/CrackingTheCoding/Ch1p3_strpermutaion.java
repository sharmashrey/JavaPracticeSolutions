package CrackingTheCoding;

public class Ch1p3_strpermutaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Happy";
		String str2 = "paHpy";
		
		System.out.println(checkPermutation2(str1, str2));
	}
	
	//sort strings and check
	public static boolean checkPermutation(String str1, String str2){
		if(str1.length() != str2.length() ){
			return false;
		}
		
		return sortstr(str1).equals(sortstr(str2));
	}
	
	public static String sortstr(String str){
		char[] content = str.toCharArray();
		 java.util.Arrays.sort(content);
		return str;
	}
	
	//check if string have identical char counts
	public static boolean checkPermutation2(String s, String t){
		int[] letters = new int[128];
		 
		char[] s_array = s.toCharArray();
		for (char c : s_array) { // count number of each char in s.
			letters[c]++;  
		}
		  
		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
		    if (--letters[c] < 0) {
		    	return false;
		    }
		}
		  
		return true;
	}
}
