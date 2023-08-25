package ex7;

class Parent {
	int x = 100;

	Parent() {
		this(200);
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000);
	}

	Child(int x) {
		this.x = x;
	}
}

public class Ex7 {
	public static void main(String[] args) {
		Child c = new Child(); 
		System.out.println("x="+c.getX()); //200 
		//child에 super 부모 생성자가 삭제되가지고 부모쪽으로 올라간다 .
	}

}
