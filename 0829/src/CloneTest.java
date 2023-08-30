class Point implements Cloneable{ //복제 
	int x;
	int y; 
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return x + "," + y;
	}
	
	@Override
	public Object clone()  {
		Object obj = null;
		try {
			obj = super.clone();
		}catch (CloneNotSupportedException e) {
		}
		return obj;
		
	}
}

public class CloneTest {
	public static void main(String[] args) {
		Point p = new Point(10, 20);
		Object obj = p.clone();
		Point cp = (Point)obj;//다운캐스팅 해주기 
		
		System.out.println(p); //10,20
		System.out.println(cp); //10,20
		
		
	}

}
