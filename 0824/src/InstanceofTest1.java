
public class InstanceofTest1 {

	public static void main(String[] args) {
		Base b1 = new Base(); 
		Base b2 = new Derived(); //upcasting
		
		if(b1 instanceof Base) {
			System.out.println("b1 is Base instance");
		}
		
		if(b1 instanceof Derived) { //얘만 출력안됨
			System.out.println("b1 is Derived instance");
		}
		
		if(b2 instanceof Base) {
			System.out.println("b2 is Base instance");
		}
		if(b2 instanceof Derived) {
			System.out.println("b2 is Derived instance");
		}

	}

}
