package arrayex;

public class ArrayTest14 {
	public static void main(String[] args) {
//		1 1 1 1 1
//		1 2 3 4 5
//		1 3 6 10 15
//		1 4 10 20 35
//		1 5 15 35  70 
//		왼,위 더해서 자리 채워주기 

		int[][] arr = new int[5][6];

		for (int i = 0; i < arr[0].length; i++) {
			arr[0][i] = 1;
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
				
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr[0].length; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}

//10 1 20 1 30 1 40 1
//11 2 21 3 31 4 41 5  -> 1씩증가
//12 3 22 6 32 10 42 15 -> 3,4,5씩증가
//13 4 23 10 33 20 43 35 -> 6 10 15 
//14 5 24 15 34 35 44 70 -> 10 20 
