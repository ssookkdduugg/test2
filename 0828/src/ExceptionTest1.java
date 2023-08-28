
public class ExceptionTest1 {

	public static void main(String[] args) {
		//String str = null;//NullPointerException에러 
		String str = "hong"; 
		int[] arr = new int[5];
		
		try{
			System.out.println(str.toString());
			for(int i=0; i<arr.length; i++) {
				arr[i] = i*10;
			}
		}catch (NullPointerException e) {
			//System.out.println("null 입니다.");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("종료");
	}

}
