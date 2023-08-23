package emp;

public class Permanent extends Employee {
   
	private int sal; 
	
	
	
	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Permanent(){}
	
	public Permanent(String id, String name, int sal){
		super(id,name);
		this.sal = sal;
	}
	
	public int getPay() {
		return getSal();
	}

	@Override
	public String info() {
		return super.info()+"급여:" + getPay();
	}
	
	
	
}
