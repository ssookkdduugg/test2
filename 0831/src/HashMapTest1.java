import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {
	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<>();
		hmap.put("1001", 35); //데이터 삽입(key,value)
		
		if(hmap.containsKey("1001")==false) { //key 존재 여부 확인 
			hmap.put("1001", 40);
		}
		hmap.put("1002", 20);
		hmap.put("1003", 33);
		hmap.put("1004", 27);
		Integer value = hmap.get("1001"); //key로 value 데이터 조회 
		System.out.println(value);
		System.out.println("============");
		for(Integer n :hmap.values()) { //value 전체 목록 조회 
			System.out.println(n);
		}
		
		System.out.println("============");
		for( String s: hmap.keySet()) { //key만나옴 hash여서 순서대로 안나옴. 
			//System.out.println(hmap.get(s)); //key를 가져와서 value 출력하기 
			System.out.println(String.format("key:%s value:%d",s,hmap.get(s)));
		}
		
		hmap.remove("1004");
		System.out.println("============");
		for(Map.Entry<String, Integer> entry: hmap.entrySet()) {
			System.out.println(String.format("key:%s value:%d",entry.getKey(), entry.getValue() ));
		}
		
		
		
		
	}

}
