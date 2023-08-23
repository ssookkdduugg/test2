package shape;

public class Rectangle extends Shape {
	private Point startPos;
	private int width;
	private int height;
	
	public Rectangle(){
		
	}

	public Rectangle(String color,Point startPos,int width, int height){
		super(color);
		this.startPos =startPos;
		this.width= width;
		this.height = height;
	}
	public Rectangle(String color, int spX, int spY, int width, int height) {
		super(color);
		this.startPos = new Point(spX, spY);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String info() {
		return "[사각형: 색("+ super.info()+"), 시작점("+startPos.x+","+startPos.y+"), 너비("+width+"), 높이("+height+")]";
	}

	public Point getStartPos() {
		return startPos;
	}

	public void setStartPos(Point startPos) {
		this.startPos = startPos;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
	
	
}
