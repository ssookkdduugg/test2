import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		String str ="Good Luck";
		int idx = str.indexOf('L');
		int idx2 = str.indexOf('l');
		
		System.out.println(idx); //5
		System.out.println(idx2); //없으면 -1 
		
		int idx3 = str.indexOf("Good");
		System.out.println(idx3); //0
		
		String str2 = "apple place";
		int idx4 = str2.indexOf('p');
		int idx5 = str2.lastIndexOf('p');
		System.out.println(idx4); //1
		System.out.println(idx5); //6
		
		String str3 = str2.replace('p', 't');
		System.out.println(str3);
		System.out.println(str2); //String은 원래값 안변하니까 
							// 변하려고 하는값은 변수에 담아주고 출력 
		String str4 = str2.replace("place", "banana"); //apple banana
		System.out.println(str4);
		
		String fruitStr ="apple,banana,fineapple,melon,strawberry";
		String[] fruitArr =   fruitStr.split(",",3); //fineapple,melon,strawberry
		for(int i=0; i<fruitArr.length; i++) {
			System.out.println(fruitArr[i]);
		}
		
		int ss = fruitStr.indexOf("fineapple");
		System.out.println(ss);
		String xx = fruitStr.substring(13,22);
		System.out.println(xx); //fineapple
//		
//		System.out.print("Y/N를 선택하세요:");
//		Scanner sc = new Scanner(System.in);
//		String answer = sc.nextLine();
//		if(answer.toLowerCase().equals("y")) { //문자열 비교함수 equals
//			System.out.println("Yes 선택");
//		}else if (answer.toUpperCase().equals("N")) {
//			System.out.println("No 선택");
////		}
//		
		String str5 = "     Hello    ".trim();
		System.out.println(str5);
		
		Point p = new Point(10, 10);
		int n = 100;
		String str6 = String.valueOf(p);  
		String str7 =""+p;
		System.out.println(str6); //10,10
		System.out.println(str7); //10,10
		
	}

}
