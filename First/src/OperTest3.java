
public class OperTest3 {

	public static void main(String[] args) {
		//System.out.println(10.0/4); //2.5
		
		int kor = 99, eng=88, math=100;
		int tot = kor+eng+math;
		double avg = tot/3.0;
		System.out.println("평균:"+avg);
		
		int mod = 10%4;
		System.out.println(mod);
		
		byte a = 10;
		byte b = 20; 
		byte c = (byte)(a+b); // a+b는 int로 되니까 byte로 강제 형변환
		
		int i1 = 100000;
		int i2 = 200000;
		long res = i1 * (long)i2; 
		System.out.println(res);
		
		
		long i3 = 100000*100000L;
		System.out.println(i3);
		
		int i4 = 100000*100000/100000;
		System.out.println(i4);
		
		int i5 = 100000/100000*100000;
		System.out.println(i5);
		
		
	}

}
