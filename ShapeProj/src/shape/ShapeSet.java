package shape;

public class ShapeSet {
	Shape[] shapes = new Shape[100]; //부모타입 
	int count =0; 
	
	public void add(Shape shape) {
		shapes[count++] = shape;
	}
	
	
	public void allShapeDraw() {
		for(int i=0; i<count;i++) {
			System.out.println(shapes[i].info());
		}
	}
	
	
	
}
