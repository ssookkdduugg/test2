package emp;

public class Sales extends Permanent{
	private int bonus; 
	
	public Sales(String id, String name, int sal, int bonus){
		super(id,name,sal);
		this.bonus = bonus;
	}
	
	public Sales(){}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	
	@Override
	public int getPay() {
		return super.getPay()+ getBonus();
	} 
	
	
	
}
