package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapToset {
     
	public static Map<Integer, String> mapToSet() {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "sruthi");
		map.put(2, "Bujji");
		map.put(3, "Jik");
		
		System.out.println(map);
		return map;
	}
	public static void main(String[] args) {
		
	
		Map<Integer,String> ma= mapToSet();
		
		Set<Object> keyset=new HashSet<>(ma.keySet());
		keyset.add(4);
		keyset.add(5);
		
		System.out.println(keyset);
		
		Set<String> keyvalue=new HashSet<>(ma.values());
		keyvalue.add("Hyderabad");
		keyvalue.add("Banglore");
		
		System.out.println(keyvalue);
		
	}

}
