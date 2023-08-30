
public class StringTest1 {
	public static void main(String[] args) {
		String a = "a";
		a = "b";
		
		int n=10; 
		n=20; 
		
		String s1 = null; 
		String s2 = ""; //string은 null을 포함. 빈문자열 오류안남.
		//char c =''; char은 오류 
		
		String s3 = new String("abc");
		char[] carr= { 'a','b','c' };
		String s4 = new String(carr);
		System.out.println(s3); //abc
		System.out.println(s4); //abc
		
		StringBuffer sb = new StringBuffer("abc");
		String s5 = new String(sb);
		System.out.println(s5); //abc
		
		String bs = "hello ";
		String cs = bs.concat("world");
		System.out.println(bs); //hello 
		System.out.println(cs); //hello world 이어서 붙일려면 concat()
		System.out.println(cs.contains("hello")); //true
		String filename= "test.txt";
		System.out.println(filename.endsWith("txt")); //true 맨끝에 글자 확인
		
		String[] files = { "test.txt", "temp.hwp", "backup.txt"};
		for(int i=0; i<files.length; i++) {
			if(files[i].endsWith("txt")) { //txt로 끝나는 파일만 가져오기 
				System.out.println(files[i]);
			}
		}
		
		
		
		
	}

}
