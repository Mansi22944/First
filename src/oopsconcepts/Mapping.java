package oopsconcepts;

import java.util.*;
import java.util.Map;

public class Mapping {

	public static void main(String[] args) {
//		Map<Integer,Integer> hg = new HashMap<>();
//		hg.put(1, 1);
//		hg.put(56, 2);
//		
//		if(hg.containsKey(56)) {
//			System.out.println("true:"+hg.get(56));
//			
//		}
//		if(hg.containsValue(2)){
//			System.out.println("Success");
//		}
//		
//		Map<Integer,String> m1=new Hashtable<>();
//		m1.put(12, "Chair");
//		m1.put(13,"Table");
//		m1.put(14, "Bottel");
//		m1.put(15, "beg");
		
		
//		System.out.println(m1);
//		
//		if(m1.containsKey(16)) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
		Map<Integer,String> m2=new LinkedHashMap<>();
		m2.put(17, "Water");
		m2.put(18, "Air");
		m2.put(18, "Sky");
		m2.put(20, "Earth");
		System.out.println(m2);
		
		if(m2.containsKey(17)) {
			System.out.println("true");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println(m2.get(17));
		
		System.out.println(m2.remove(18));
		
	
		System.out.println(m2.size());
		
		for(Map.Entry<Integer,String> e:m2.entrySet()) {
			System.out.println(e.getKey()+"="+e.getValue());
		}
		
	}

}
