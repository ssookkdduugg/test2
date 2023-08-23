class Parent{
	int n; 
//	Parent(){
//		System.out.println("Parent()");
//	}
	Parent(int n){
		this.n = n;
		System.out.println("Parent()"+n);
	}
	
}

class Child extends Parent{
	int m; 
	Child(){
		super(0);
		System.out.println("Child()");
	}
	Child(int n, int m){
		super(n); //n은 부모거니까 부모한테 넘겨줘서 n의 값 구하기 
		this.m = m;
		System.out.println(m);
	}
	
}

public class InhetitTest3 {
	public static void main(String[] args) {
		//Parent p = new Parent();
		Child c = new Child(10,20);
	}
	
}
