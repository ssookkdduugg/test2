
public class StringPlus {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 20;
		
		int res = v1+v2;
	
		System.out.println(res);
		
		String str1 = "abc";
		String str2 = "def";
		String sres = str1+str2;
		System.out.println(sres);
		
		System.out.println(str1+res);
		
		String seven = "7";
		char seven2 = '7';
		int seven3 = 7; 
		System.out.println(seven+seven2+seven3); //777
		System.out.println(seven2+seven3+seven); //62 String이 안오면 7의아스키코드 + 7 
		System.out.println("7"+7+7); //777
		System.out.println(7+7+"7"); ///147
	}

}
