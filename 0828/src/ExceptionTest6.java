import java.io.IOError;
import java.io.IOException;

public class ExceptionTest6 {
	
	static void method1() throws IOException,Exception {
		//method1() 메소드에다가 2가지 예외를 위임한것임. 
		boolean flag = false;
		if(flag) {
			throw new IOException("입출력 예외");
		}else {
			throw new Exception("모든 예외");
		}
	}
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
