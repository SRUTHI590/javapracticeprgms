package programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToset {

	public static void main(String[] args) {
		
		List<String> lst=new ArrayList<>();
		lst.add("sruthi");
		lst.add("Bujji");
		lst.add("nik");
		lst.add("nik");
		
		for(String list:lst) {
			
			System.out.println(list);
		}
		Set<String> set=new HashSet<>(lst);
		set.add("Anantapur");
		set.add("Hyderabad");
		set.add("Banglore");
		
		System.out.println(set);

	}

}
