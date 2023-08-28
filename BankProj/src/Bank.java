
import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;
import exc.BankError;
import exc.BankException;

public class Bank {
	Account[] accs = new Account[100];
	int accCnt;
	Scanner sc = new Scanner(System.in);

	int menu() throws BankException {

		System.out.println("[코스타은행]");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 전체계좌조회");
		System.out.println("0. 종료");
		System.out.print("선택>>");
		int sel = Integer.parseInt(sc.nextLine());
		if (!(sel > 0 && sel <= 5))
			throw new BankException("메뉴오류", BankError.MENU);

		return sel;
	}

	void selAccMenu() throws BankException {
		System.out.println("[계좌개설]");
		System.out.println("1.일반계좌");
		System.out.println("2.특수계좌");
		System.out.print("선택>>");
		int sel = Integer.parseInt(sc.nextLine());
		switch (sel) {
		case 1:
			makeAccount();
			break;
		case 2:
			makeSpecialAccount();
		default:
			// try {
			throw new BankException("메뉴오류", BankError.MENU);
//			}catch (BankException e) {
//				System.out.println(e);
//				selAccMenu();
//			}
		}

	}

	void makeSpecialAccount() throws BankException {
		System.out.println("[특수계좌 개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account searchedAcc = searchAccById(id);
//		try {
			if (searchedAcc != null)
				throw new BankException("계좌오류", BankError.EXISTID);
//		} catch (Exception e) {
//			System.out.println(e);
//			makeAccount();
//		}
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("등급(VIP-V,Gold-G,Silver-S,Normal-N):");
		String grade = sc.nextLine();
		 accs[accCnt++]=new SpecialAccount(id,name,money,grade);
	}

	Account searchAccById(String id) {
		for (int i = 0; i < accCnt; i++) {
			if (accs[i].getId().equals(id)) {
				return accs[i];
			}
		}
		return null;
	}

	void makeAccount() throws BankException {
		System.out.println("[계좌 개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc != null) {
			throw new BankException("계좌오류", BankError.EXISTID);
		}

		System.out.println("이름:");
		String name = sc.nextLine();
		System.out.println("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		accs[accCnt++] = new Account(id, name, money);
	}

	void deposit() throws BankException {
		System.out.println("[입금]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		// try {
		if (acc == null)
			throw new BankException("계좌오류", BankError.NOID);
//		}catch (BankException e) {
//			System.out.println(e);
//			deposit();
//		}
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		acc.deposit(money);
	}

	void withdraw() throws BankException {
		System.out.println("[출금]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		// try {
		if (acc == null)
			throw new BankException("계좌오류", BankError.NOID);
//		}catch (BankException e) {
//			System.out.println(e);
//			withdraw();
//		}
		System.out.print("출금액:");
		int money = Integer.parseInt(sc.nextLine());
		acc.withdraw(money);
	}

	void accountInfo() throws BankException {
		System.out.println("계좌조회");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		// try {
		if (acc == null)
			throw new BankException("계좌오류", BankError.NOID);
//		}catch (BankException e) {
//			System.out.println(e);
//			accountInfo();
//		}
		System.out.println(acc);// tostring 생략가능
	}

	void allAccountInfo() {
		for (int i = 0; i < accCnt; i++) { // 실계좌있는만큼 반복
			System.out.println(accs[i]);// tostring 생략가능

		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		int sel;
		while (true) {
			try { // 오류가능성 있는애들 넣기
				sel = bank.menu();
				if (sel == 0)
					break;
				switch (sel) {
				case 1:
					bank.makeAccount();
					break;
				case 2:
					bank.deposit();
					break;
				case 3:
					bank.withdraw();
					break;
				case 4:
					bank.accountInfo();
					break;
				case 5:
					bank.allAccountInfo();
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("입력 형식이 맞지않습니다. 다시 선택하세요.");
			} catch (BankException e) {
				System.out.println(e);
			}

		}

	}
}
