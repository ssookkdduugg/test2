import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Account {
	String id;
	int balance;

	Account() {
	}

	Account(String id, int balance) {
		this.id = id;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format("계좌번호: %s, 잔액:%d", id, balance);
	}
}
class IdCompare implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		//return o1.id.compareTo(o2.id);
		return o2.id.compareTo(o1.id); //1004,1003,1002 순서로 정렬됨
	}
	
}
public class ArrayListTest3 {
	public static void main(String[] args) {
		List<Account> accs = new ArrayList<>();
		accs.add(new Account("10004",100)); 
		accs.add(new Account("10002",300));
		accs.add(new Account("10003",200));
		
		Collections.sort(accs, new IdCompare()); //비교하는 함수로 정렬해도됨 
//반복문 방법 1 조회만할거면 향상된 for문 사용하는게 더 빠름.ㄴ
//		for(Account acc: accs) {
//			System.out.println(acc);
//		}

//반복문 방법2 컬렉션은 length가 아니라 size 
//		for(int i=0; i<accs.size(); i++) {
//			System.out.println(accs.get(i));
//		}
		

//반복문 방법3 iterator는 반복자임. arrayList여서 반복자 iterator임.
//hasNext 다음에 출력할거있어? 확인 
//중간에 수정할 사항있으면 이방법.
		Iterator<Account> it = accs.iterator();
		while(it.hasNext()) {
			Account acc = it.next();
			System.out.println(acc);
		}
	}

}
