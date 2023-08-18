package arrayex2;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[][] narr2 = new int[][] {
			{1,2,3,4},{5,6,7,8},{9,10,11,12}
		};
		
		int[][] narr3 = new int[3][4];
		narr3[0]= new int[] {1,2,3,4};
		narr3[1]= new int[] {5,6,7,8};
		narr3[2]= new int[] {9,10,11,12};
		
		//가변 배열 
		int[][] narr4 = new int[3][];
		narr4[0] = new int[] {1,2,3,4,5};
		narr4[1] = new int[] {10,20};
		narr4[2] = new int[] {100,200,300};
		
		
	}

}
