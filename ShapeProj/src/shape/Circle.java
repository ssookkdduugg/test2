package shape;

public class Circle extends Shape {
	
	//필드
	Point center = new Point();
	int radius;
	
	//생성자
	public Circle() {}
	public Circle(String color, int x, int y, int radius) {
		super(color);
		this.center.x = x; 
		this.center.y = y;
		this.radius = radius;
	}
	
	public Circle(String color, Point cenPoint, int radius) {
		super(color);
		this.center = cenPoint;
		this.radius = radius;
	}

	//getter, setter
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//인스턴스메소드
	@Override
	public String info() {
		return String.format("[원:색(%s), 중심점(%d,%d), 반지름(%d)]"
										, this.getColor(), this.center.getX(), this.center.getY(), this.radius);
		
	}
	
	

}