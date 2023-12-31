package ex7;

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product배열 cart에 사용될 index

	void buy(Product p) { // 가격
		/*
		 * (1) 아래의 로직에 맞게 코드를 작성하시오. 1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다. 1.2 가진
		 * 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고 1.3 장바구니에 구입한 물건을 담는다.(add메서드 호출)
		 */

		if (money < p.price) {
			System.out.println("잔액이 부족하여" + p.toString() + "을/를 살수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);
	}

	void add(Product p) {
		/*
		 * (2) 아래의 로직에 맞게 코드를 작성하시오. 1.1 i의 값이 장바구니의 크기보다 같거나 크면 1.1.1 기존의 장바구니보다 2배 큰
		 * 새로운 배열을 생성한다. 1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다. 1.1.3 새로운 장바구니와 기존의 장바구니를
		 * 바꾼다. 1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
		 */

		if (i >= cart.length) {
			Product[] cart2 = new Product[cart.length * 2];
			System.arraycopy(cart, 0, cart2, 0, cart.length);
			cart = cart2; //기존 자리3개 있던 카트는 버리기 새로운 카트덮어씌우기
		}
		cart[i++] = p;
	}

//		if(p instanceof Tv) {
//			Tv tv = (Tv)p; 
//			System.out.println(tv.toString());        
//		}
//		if(p instanceof Computer) {
//			Computer com = (Computer)p;
//			com.toString();
//		}
//		if(p instanceof Audio) {
//			Audio audio = (Audio)p;
//			audio.toString();
//		}

	void summary() {
		/*
		 * (3) 아래의 로직에 맞게 코드를 작성하시오. 1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다. 1.2 장바구니에 담긴 물건들의
		 * 가격을 모두 더해서 출력한다. 1.3 물건을 사고 남은 금액(money)를 출력한다.
		 */
		String pnames= "";
		int totmat = 0; 
		for (int k = 0; k <i; k++) {
			pnames += cart[k].toString()+",";
			totmat += cart[k].price;
		}
		System.out.println("구입한 물건:" + pnames);
		System.out.println("사용한 금액:" +totmat);
		System.out.println("남은 금액:" + money);
	}
}

class Product {
	int price; // 제품의 가격

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

public class Ex19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}
