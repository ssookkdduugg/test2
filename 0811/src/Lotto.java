
public class Lotto {

	public static void main(String[] args) {
		int[] ball = new int[45];
		//ball배열에 1~45까지 값으로 초기화
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
			//System.out.print(ball[i]+",");
		}
		
		//Random 값 
		//0~44 중 하나의 임의의 정수 구해서 변수에 담기 : idx1, idx2 변수 2개 
		
		for(int i=0; i<1000;i++) {  //1000번 돌리기 
			int idx1 = (int)(Math.random()*45);
			int idx2 = (int)(Math.random()*45);
			
			int temp = ball[idx1];
			ball[idx1] = ball[idx2];
			ball[idx2] = temp;
		}
		
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+",");
		}
	
		
		
	}

}
