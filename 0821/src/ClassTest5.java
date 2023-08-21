
class Account {
	String id;
	String name;
	int balance;

	String info() {
		return String.format("계좌번호:%s, 이름:%s, 잔액:%d", id, name, balance);
	}

	void deposit(int money) {
		this.balance += money;
	}

	void withdraw(int money) {
		if (balance >= money) {
			this.balance -= money;
		}

	}
}

class Bank {
	Account[] accs = new Account[100]; // 공간이 100개인 계좌방
	int accCnt;

	void makeAccount(String id, String name, int money) {
		Account acc = new Account();
		acc.id = id;
		acc.name = name;
		acc.balance = money;
		accs[accCnt++] = acc;

	}

	void allAccountInfo() {
		for (int i = 0; i < accCnt; i++) { //실계좌있는만큼 반복

			System.out.println(accs[i].info());

		}
	}
	
	
	void accountInfo(String id) {
		for(int i=0; i<accCnt; i++) {
			if(accs[i].id ==id) {
				System.out.println(accs[i].info());
			}
		}
	}
	
	void deposit(String id,int money) {
		for(int i=0; i<accCnt; i++) {
			if(accs[i].id ==id) {
				accs[i].balance += money;
				
			}
		}
		
		
	}
	
	void withdraw(String id,int money) {
		for(int i=0; i<accCnt; i++) {
			if(accs[i].id ==id) {
				accs[i].balance -= money;
				
			}
		}
	}
	
	

}

public class ClassTest5 {

	public static void main(String[] args) {
		Account acc2 = new Account();

		Bank bank = new Bank();
		bank.makeAccount("10001", "고길동", 100000);
		bank.makeAccount("10002", "김길동", 200000);

		bank.allAccountInfo();
		// 계좌번호: 10001, 이름:고길동, 잔액:100000
		// 계좌번호: 1002, 이름:김길동, 잔액:200000
		
		bank.accountInfo("10001");
		// 계좌번호: 10001, 이름:고길동, 잔액:100000
		
		
		bank.deposit("10001",10000);
		bank.accountInfo("10001");
		// 계좌번호: 10001, 이름:고길동, 잔액:110000
		
		bank.withdraw("10001",5000);
		bank.accountInfo("10001");
		// 계좌번호: 10001, 이름:고길동, 잔액:105000
		
		
//		Account acc1 =  new Account();
//		acc1.id = "10001";
//		acc1.name ="고길동";
//		acc1.balance = 100000;
//		acc1.deposit(10000);
//		System.out.println(acc1.info());
//		acc1.withdraw(20000);
//		System.out.println(acc1.info());

	}

}

//계좌번호: 10001, 이름:고길동, 잔액:100000
//계좌번호: 10001, 이름:고길동, 잔액:110000
//계좌번호: 10001, 이름:고길동, 잔액:90000
