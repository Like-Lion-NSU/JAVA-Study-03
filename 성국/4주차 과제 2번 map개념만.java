package likelion;

import java.util.HashMap;
import java.util.Map;

public class EX2 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		Map<Integer,Integer> map2 = new HashMap<Integer,Integer>();
		
		map.put("James", 10);
		map.put("Alice", 20);
		map.put("Thomas", 30);
		
		map2.put(1, 3000);
		map2.put(2, 4000);
		map2.put(3, 3500);
		System.out.println("[user name]");
		for(String key:map.keySet()) {
		
		System.out.println(key);
		
		}System.out.println("\n\n[user power 합계]");
		for(Integer key:map2.keySet()) {
			
			
			System.out.println(map2.get(key));
			
		}
	}

}
