
public class Ex20 { //clone, system.arraycopy
	
	static int[] shuffle(int[] arr) {
//		int[] mixarr = new int[arr.length];
//		System.arraycopy(arr, 0, mixarr, 0, arr.length); //배열복제 
	    int[] mixarr = arr.clone(); //배열복제 2번째 방법 
		
		for(int i=0; i<100; i++) {
			int idx1 = (int)(Math.random()*arr.length);
			int idx2 = (int)(Math.random()*arr.length);
			int temp = arr[idx1];
			mixarr[idx1] = arr[idx2];
			mixarr[idx2] = temp;
		}
		return mixarr;
	}
	
	
	
	public static void main(String[] args) {

		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		System.out.println("------------섞기전");
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(original));
		System.out.println(java.util.Arrays.toString(result));
		System.out.println(original==result); //false
//		shuffle(original);
//		System.out.println(java.util.Arrays.toString(original));
		
		
		
	}

}
