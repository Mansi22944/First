package oopsconcepts;

import java.util.*;


public class set {

	public static void main(String[] args) {
//		Set<Integer> s1= new HashSet<>();
//		s1.add(10);
//		s1.add(20);
//		s1.add(30);
//		s1.add(10);
//		
//		System.out.println(s1);
////		
////		Iterator<Integer> d = s1.iterator();
////		while(d.hasNext()){
////			System.out.println(d.next());
////		}
////		
//		s1.remove(20);
//		System.out.println(s1);
//		Set<Integer> s2=new LinkedHashSet<>();
//		s2.add(11);
//		s2.add(12);
//		s2.add(13);
//		s2.add(11);
//		
//		System.out.println(s2);
//		
//		Iterator<Integer> e= s2.iterator();
//		while(e.hasNext()) {
//			System.out.println(e.next());
//			
//		}
//		System.out.println();
//		// for each loop
//		for(int i:s2) {
//			System.out.println(i);
//		}
		Set<String> s3=new TreeSet<>();
		s3.add("Monitor");
		s3.add("mouse");
		s3.add("cpu");
		s3.add("Keyboard");
		
		System.out.println(s3);
		
		s3.remove("mouse");
		System.out.println(s3);
		
		System.out.println(s3.contains("Monitor"));
		
		System.out.println(s3.isEmpty());
		
		System.out.println(s3.hashCode());
		
	}
}
		
