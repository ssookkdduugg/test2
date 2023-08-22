
class Account{
	String id; 
	String name;
	int balance;  //인스턴스변수 자동초기화됨 0 
	
	Account(String id,String name, int balance){
		this.id = id;
		this.name = name; 
		this.balance = balance;
	}
	
	String info() {
		return "계좌번호:"+this.id+" 이름:"+this.name+" 잔액:"+this.balance;
	}
	
}
public class ThisTest1 {
	public static void main(String[] args) {
		Account acc1 = new Account("10001", "홍길동", 100000);
		System.out.println(acc1.info());
	}

}
