package pac;


import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Date;
import java.util.Scanner;
public class MyClass {
	Scanner sc = new Scanner(System.in);
	public Date date1;
	java.util.Date date2;
	//같은 클래스 사용할때 하나만 import하고 나머지는 앞에 java.util.Date 처럼 붙여서 선언. 
	
	FileReader fr;
	FileWriter fw;
	
	public MyClass(){
		
	} //다른 패키지안의 클래스에서 사용할려면 생성자도 public 붙어야함
	
	

}
