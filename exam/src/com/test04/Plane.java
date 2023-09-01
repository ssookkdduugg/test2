package com.test04;

abstract class Plane {
	String planeName;
	int fuelSize;

	Plane() {
	}

	Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	void refuel(int fuel) {// 주유하기
		this.fuelSize += fuel;
	}

	abstract void flight(int distance); // 운항하기

}

class Airplane extends Plane {

	Airplane() {
	}

	Airplane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	@Override
	void flight(int distance) { // 운항시 연료 30 감소
		int i = 10; // 10운항시
		int minus = 30; // 연료 30감소
		int feet = 0;

		if (distance % 10 == 0)
			feet = distance / i;
		super.fuelSize -= (minus * feet);

	}

}


class Cargoplane extends Plane{
	
	Cargoplane(){}
	
	Cargoplane(String planeName,int fuel){
		this.planeName = planeName;
		this.fuelSize = fuel;
	}

	@Override
	void flight(int distance) { //10운항시 연료 50감소 
		int i = 10; // 10운항시
		int minus = 50; // 연료 30감소
		int feet = 0;

		if (distance % 10 == 0)
			feet = distance / i;
		super.fuelSize -= (minus * feet);
		
	}
	
}


