
public class Ex22 {
	/*
	(1) isNumber메서드를 작성하시오.
	*/
	
	static boolean isNumber(String st) {
		if(st == null || st.length()==0) return false;
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			if(!(ch >='0' && ch<= '9')) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));

	}

}
