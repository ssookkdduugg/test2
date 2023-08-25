class MyClass{
	Point p; 
	MyClass(){
		p = new Point();
	}
}

class YourClass extends MyClass{
	int x; 
}

public class PointTest1 {
	public static void main(String[] args) {
		YourClass c = new YourClass();
	

	}

}
