package shape;

public class Triangle extends Shape {
	private Point p1;
	private Point p2;
	private Point p3;
	
	
	public Triangle(){}
	
	public Triangle(String color,Point p1, Point p2, Point p3){
		super(color);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3; 
	}
	
	public Triangle(String color, int x1, int y1, int x2, int y2, int x3, int y3) {
		super(color);
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
//		this.p1.setX(x1);
//		this.p1.setY(y1);
//		this.p2.setX(x2);
//		this.p2.setY(y2);
//		this.p3.setX(x3);
//		this.p3.setY(y3);
	}
	
	@Override
	public String info() {
		return "[삼각형: 색("+ super.info()+"), 점1("+p1.x+"," + p1.y + "), 점2("+p2.x+","+p2.y+"), 점3("+p3.x+","+p3.y+")]";
		
	}
	
}
