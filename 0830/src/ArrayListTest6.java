import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest6 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println(numbers);
		numbers.removeIf(n->(n%3)==0);
		//n을 하나하나 가져와서 n%3==0인 숫자들을 삭제해라. 뒤에 조건들이 true일경우 실행  
		System.out.println(numbers);
	}

}
