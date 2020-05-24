package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {

	public static void main(String[] args) {
		
		Map<Object,String> map=new HashMap<>();
		map.put(1, "sruthi");
		map.put(2, "buji");
		map.put(3, "Jik");
		
		List<Object> list=new ArrayList<>(map.keySet());
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		List<String> list1=new ArrayList<>(map.values());
		list1.add("Chennai");
		list1.add("Hyderabad");
		list1.add("Banglore");
		System.out.println(list1);
		
		
		

	}

}
