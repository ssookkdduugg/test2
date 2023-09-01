package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

// 이름(name)이 기본 정렬기준이 되도록 하시
class Human  {
	String id;
	String name;
	int age;
	String address;

	Human(String id, String name, int age, String addString) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = addString;
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%d,%s", id, name, age, address);
	}

	
	
}





class IdCompere implements Comparator<Human>{
	@Override
	public int compare(Human o1, Human o2) {
		return o2.id.compareTo(o1.id);
	}
}

class Ex5 {
	public static void main(String[] args) {
		ArrayList<Human> list = new ArrayList<>();
		list.add(new Human("000123", "홍길동", 24, "서울시 금천구"));
		list.add(new Human("000125", "홍길동", 28, "서울시 강남구"));
		list.add(new Human("931216","김길동", 32, "경기도 광명시"));
		list.add(new Human("880505","박길동", 37, "서울시 강서구 "));
		list.add(new Human("991101","차길동",27, "경기도 과천시"));
		
		list.add(new Human("021213","안자바",22, "서울시 송파구" ));
		Collections.sort(list, new IdCompere());
		Iterator<Human> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
