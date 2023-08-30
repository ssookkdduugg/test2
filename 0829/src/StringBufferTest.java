
public class StringBufferTest {

	public static void main(String[] args) {//버퍼보다 빌더
		StringBuilder sb = new StringBuilder(100); 
		sb.append("abcdefg");
		System.out.println(sb.capacity()); //100
		System.out.println(sb.length()); // 7
		
		sb.insert(1, 'd');
		System.out.println(sb); //adbcdefg
		System.out.println(sb.length());//8
		sb.delete(2, 5); //adefg
		System.out.println(sb); 
		
		sb.replace(0, 2, "ta"); //taefg
		System.out.println(sb);
		sb.reverse();//gfeat
		System.out.println(sb);//문자 뒤집기 
		sb.setCharAt(2, 'E'); //해당 인덱스 문자 바꾸기 gfEat
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setLength(3);
		System.out.println(sb);
		
		

	}

}
