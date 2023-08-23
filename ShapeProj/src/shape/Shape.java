package shape;

public class Shape {
	private String color;
	
	Shape(){}
	
	Shape(String color){
		this.color = color;
	}
	
	void draw() {
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String info() {
		return "컬러"+color;
	}
	

}
