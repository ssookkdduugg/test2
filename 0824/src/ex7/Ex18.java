package ex7;

public class Ex18 {
	static void action(Robot robot) {
		//instance of 사용 
		
	if(robot instanceof DanceRobot) {
		DanceRobot d = (DanceRobot)robot;
		d.dance();
	}
	
	if(robot instanceof SingRobot) {
		SingRobot s = (SingRobot)robot; 
		s.sing();
	}
	
	if(robot instanceof DrawRobot) {
		DrawRobot d = (DrawRobot)robot;
		d.draw();
	}
		
	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
		
		Robot sR = new SingRobot();
	} // main
}




class Robot {
	
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
