package pac;

public class Number{
	private int pnum; 
	
	
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	private void pmethod() {
		pnum = 10; 
	} 
	int dnum; //default 
	
	
	public int getDnum() {
		return dnum; 
	}
	public void setDnum(int data) {
		dnum = data;
	}
	
	public void dmethod() {
		System.out.println(pnum);
	} //default 
	
	public int ppnum; 
	public void ppmethod() {}
	
	protected int prnum; 
	public void prmethod() {}
}

