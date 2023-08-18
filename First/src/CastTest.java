
public class CastTest {

	public static void main(String[] args) {
		byte bt = 10;
		int i = bt;

		byte bt2 = (byte) i; // 강제 형변환

		float f = i; // int는 float에 들어갈수있다. float가 더 큼.

		int i2 = (int) f;// 소숫점 잘림.

		double d = f;
		float f2 = (float) d;

		// float>long

	}

}
