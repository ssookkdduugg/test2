package ex;

public class Ex4 {
	static void printGraph(int[] dataArr, char ch) {
		
//		for(int i=0; i<dataArr.length; i++) {
//			int a = dataArr[i];
//			for(int j=0;j<a;j++ ) {
//				System.out.print(ch);
//			}
//			System.out.println(dataArr[i]);
//		}
		
		for(int n : dataArr) {
			for(int i=0; i<n; i++) {
				System.out.print(ch);
			}
			System.out.println(n);
		}
		
	}

	public static void main(String[] args) {
		printGraph(new int[] { 3, 7, 1, 4 }, '*');
	}

}
