package main.java.com.cj;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Details {
	
	public void countDupChars(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		char[] chars = str.toLowerCase().toCharArray();
			
		for(Character ch:chars) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		
		for(Character ch:keys) {
			if(map.get(ch)>1) {
				System.out.println("Char "+ch+" : "+map.get(ch) );
			}
		}
		
	}
}

public class DupChar {

	public static void main(String[] args) {
		
		Details obj = new Details();
		obj.countDupChars("Srinivas Regadbai");
		

	}

}
