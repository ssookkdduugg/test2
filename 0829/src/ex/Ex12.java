package ex;

public class Ex12 {
	/*
	 * (1) getRand메서드를 작성하시오.
	 */
	
	
	public static int getRand(int from, int to) {
		// from 범위 시작값, to 범위 끝값
//		int r = (int)(Math.random()*(8-2+1))+2;
//		//2~8 랜덤값 구하기
//		//(int)(Math.random()*(최대값-최소값+1))+최소값 
//		//구간사이에서 min max 구하는 공식 
//		System.out.println(r);
		
		
		int min = Math.min(from, to);
		int max = Math.max(from, to);
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++)
			System.out.print(getRand(1, -3) + ",");
	}

}
