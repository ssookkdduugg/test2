package ex;

public class EX7 {
	public static boolean contains(String src, String target) {
//		boolean a = src.contains(target);
//		return a;
		
		return src.indexOf(target)>=0;
	}
	//true
	//false
	
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}

}
