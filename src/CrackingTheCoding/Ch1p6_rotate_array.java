package CrackingTheCoding;

public class Ch1p6_rotate_array {

	public static void main(String[] args) {
		// Photo in form NxN matrix, TODO Rotate the image by 90 degrees		
		// N = 10
		int side = 10;
		int[][] photo = new int[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				photo[i][j] = i+j;
			}
		}
		
		rotatematrix(photo, side);
		//print matrix
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.print(photo[i][j]+" ");
			}System.out.print("\n");
		}
	}
	
	//start from outer row(replace the whole box) & goto inner boxes
	//1. O(n^2) complexity , since any algorithm must touch all the elements
	public static void rotatematrix(int[][] photo, int side){
	//	photo.length ;
		
	for(int layer=0;layer<side/2;++layer){
		int first = layer;
		int last = side-layer-1;
		for(int inner = first; inner < last;inner++){
			//utilise concept of offset
			int offset = inner-first;
			
			//save top
			int top = photo[first][inner];
			
			//left -> top
			photo[first][inner]= photo[last-offset][first];
			
			//bottom -> left
			photo[last-offset][first] =photo[last][last-offset];
			
			//right->bottom
			photo[last][last-offset]=photo[inner][last];
			
			//top->right
			photo[inner][last] = top;
		}
		
	}
		
		
	}
	
}
