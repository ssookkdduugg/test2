
class MyArray{ //싱글톤 객체 하나를 같이쓰는거/ 생성자 private로 설정 
	int[] arr = new int[10];
	private static MyArray myArray; 
	private MyArray() {} 
	public static MyArray getMyArrayReference() {
		if(myArray==null) {
			myArray = new MyArray();
		}
		return myArray;
		//return new MyArray(); 하면 false 
	}
	
	public void setData(int idx, int data) {
		arr[idx] = data;
	}
	
	public int getData(int idx) {
		return arr[idx];
	}
}


public class PrivateConstructor {
	public static void main(String[] args) {
		MyArray ma1 = MyArray.getMyArrayReference();
		MyArray ma2 = MyArray.getMyArrayReference();
		//ma2는 null이 아님. static 같이 쓰니까 
		System.out.println(ma1==ma2); //true
		
		ma1.setData(0, 100);
		System.out.println(ma2.getData(0));
		
	}
}
