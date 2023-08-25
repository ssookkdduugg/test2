package item;

public class SCV extends GroundUnit implements Repairable{

	public SCV() {
		super(60);
	}
	
	//인터페이스만들어주기
	public void repair(Repairable r) { //marine빼고 tank,scv,zerg 공통분모가없어서
//		if(r instanceof Unit) { // instance of 쓰는이유는 인터페이스안에 없어서
//			Unit unit = (Unit)r;
//			unit.healthPoint = unit.MAX_HP;
//		}
		
		r.fix();
		
	}

	@Override
	public void fix() {
		healthPoint = (int)Math.round(MAX_HP*0.8);
		
	}

}
