package emp;

public abstract class Employee {
	private String id; 
	private String name;
	
	public Employee() {}
	

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	public String info() {
	 return "사번:"+ id+"이름:"+name;
	}
	
	public abstract int getPay();
	//추상화하면 추상화된 클래스를 상속받아서 이기능을 활용해라 
	//아직 불완전한 메소드 만들면 abstract 클래스도 abstract 
	
	
	
	
	

}
