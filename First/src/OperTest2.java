
public class OperTest2 {

	public static void main(String[] args) {
		int i = -10;
		i = +i; // i*1;
		System.out.println(i);//-10
		
		i = -i; //i*(-1);
		System.out.println(i);//10
		
		boolean power = false;
		power = !power;
		System.out.println(power); //true
		power = !power;
		System.out.println(power); //false
		
		int j = 10; 
		System.out.println(j);
		j = ~j;
		System.out.println(j); // -11
		
		
	}

}
