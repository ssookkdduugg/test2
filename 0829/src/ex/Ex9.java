package ex;

public class Ex9 { // 스트링버퍼
	/*
	 * (1) delChar메서드를 작성하시오. (1!2@3^4~5) -> 12345 (1 2 3 4 5) -> (12345)
	 * 
	 * StringBuffer와 String클래스의 charAt(int i)과 indexOf(int ch)를 사용하라.
	 * 
	 */
	public static String delChar(String src, String delCh) {
		StringBuilder sb = new StringBuilder(src);
		for (int i = 0; i < delCh.length(); i++) {
			int idx = 0;
			while (true) {
				idx = sb.indexOf(delCh.charAt(i) + "", idx);
				if (idx < 0)
					break;
				sb.deleteCharAt(idx);
			}
		}

		return sb.toString();
	}

//		String res = new String(src);
//	      for(int i =0;i<delCh.length();i++) {
//	         res = res.replace(String.valueOf(delCh.charAt(i)), "");
//	      }
//	      return res;
//		

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}

}
