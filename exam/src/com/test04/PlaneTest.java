package com.test04;

public class PlaneTest {

	public static void main(String[] args) {
		Airplane airplane = new Airplane("L777",1000);
		Cargoplane cargoplane = new Cargoplane("C50",1000);
		
		System.out.println("Plane fuelSize");
		System.out.println("------------------");
		System.out.println(airplane.planeName +"\t"+ airplane.fuelSize );
		System.out.println(cargoplane.planeName +"\t" + cargoplane.fuelSize);
		System.out.println("100 운항");
		airplane.flight(100);
		cargoplane.flight(100);
		
		System.out.println();
		System.out.println("Plane fuelSize");
		System.out.println("------------------");
		System.out.println(airplane.planeName+"\t"+ airplane.fuelSize);
		System.out.println(cargoplane.planeName+"\t"+cargoplane.fuelSize);
		System.out.println("200 주유");
		airplane.refuel(200);
		cargoplane.refuel(200);
		
		System.out.println();
		System.out.println("Plane fuelSize");
		System.out.println("------------------");
		System.out.println(airplane.planeName +"\t"+airplane.fuelSize);
		System.out.println(cargoplane.planeName+"\t"+cargoplane.fuelSize);
	}

}
