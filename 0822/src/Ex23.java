
public class Ex23 {

	static int max(int[] dd) {
		int tmp = 0;
		if (dd == null || dd.length == 0) {
			return -999999;
		}

		for (int i = 0; i < dd.length - 1; i++) {
			if (dd[i] < dd[i + 1]) {
				dd[i] = dd[i + 1];
				tmp = dd[i];
				return tmp;
			}
		}
		return tmp;
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열

	}

}
