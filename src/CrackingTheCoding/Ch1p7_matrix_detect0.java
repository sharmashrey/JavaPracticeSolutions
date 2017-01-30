package CrackingTheCoding;

public class Ch1p7_matrix_detect0 {
	//set all rows & columns of any element=0 to 0.
	public static void main(String[] args){
		int m =10; int n =8;
		
		// MxN Matrix 10x8 & fill it up
		int[][] matrixmn = new int[m][n];
		
		for(int i=0;i< m;i++){
			for(int j=0;j<n;j++){
				if(((i+j) % 2) != 0){
				matrixmn[i][j] = i+j;
				}
				else matrixmn[i][j] =0;
			}
		}
		
		//Mark Zeroes in matrix
		setZeroes(matrixmn,m,n);
		
			
	}
	
	//Two passes: 1. Catching zero in boolean matrix
	//			  2. Setting zero in orignal Matrix
	
	public static void setZeroes(int[][] matrixmn,int m , int n){
		boolean[] row = new boolean[m];
		boolean[] column = new boolean[n];
		//make a boolean matrix for saving flag if 0 is present
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(matrixmn[i][j] == 0){
					row[m] =true;
					column[n]= true;
				}				
			}
		}	
		
		//set zero's in Target matrix
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(row[i] == true|| column[j]==true)matrixmn[m][n] =0;	
			}
		}	
	}
	
}
