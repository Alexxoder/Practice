package interviewProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		String array1 = "danger";
		String array2 = "garden";
		String array3 = "gardel";

		System.out.println(array1);
		System.out.println(array2);
		System.out.println(array3);
		
		System.out.println(array1 +" with " + array2);  
		if(validAnagram(array1,array2)) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
		
		System.out.println(array1 +" with " + array3);  
		if(validAnagram(array1,array3)) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
	static boolean validAnagram(String s1,String s2) {
			
			boolean valido = true;
			
			Map<Character,Integer> map1 = new HashMap<>();
			Map<Character,Integer> map2 = new HashMap<>();
			char key;
			Integer value;
			for(int i=0; i<s1.length();i++) {
				key = s1.charAt(i);
				value = map1.get(s1.charAt(i));
				if(map1.containsKey(key)) {
					map1.put(key,value+1);
				} else {
					map1.put(key,1);
				}
			}
			
			for(int i=0; i<s2.length();i++) {
				key = s2.charAt(i);
				value = map1.get(s2.charAt(i));
				if(map2.containsKey(key)) {
					map2.put(key,value+1);
				} else {
					map2.put(key,1);
				}
			}
			
			if(map1.size()!= map2.size()) {
				valido = false;
			}
			
			Iterator<Character> it = map1.keySet().iterator();
			
			while(it.hasNext()) {
				Character clave = (Character) it.next();
				if(!map2.containsKey(clave) && map2.get(clave) != map1.get(clave) ) {
					valido = false;
				}
			}
		
			return valido;
		}
	
}
