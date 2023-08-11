package exc;

public class Ex12 {
	public static void main(String[] args) {
		
		for(int i=0,dan=2; i<3; i++,dan+=3) {
			for(int j=1; j<=3;j++) {
				for(int k =dan; k<= ((dan+2<10)?dan+2:9); k++) {
					System.out.print(String.format("%d * %d = %d\t",k,j,k*j));
				}
				
				// k * j에서 j가 10 나오면 안되니까
				// (dan+2<10)? dan+2:9 10이 넘으면 9로 해주기 
				
				System.out.println();
			}
			System.out.println();
		}
		
//		for(int i=1; i<=3; i++) {
//			for(int j=5; j<=7;j++) {
//				System.out.print(String.format("%d * %d = %d\t",j,i,i*j));
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int i=1; i<=3; i++) {
//			for(int j=8; j<=9;j++) {
//				System.out.print(String.format("%d * %d = %d\t",j,i,i*j));
//			}
//			System.out.println();
//		}
//		
	}

}
