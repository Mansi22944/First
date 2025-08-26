package oopsconcepts;

import java.util.*;

public class Que {

	public static void main(String[] args) {
//      Queue<String> q1= new ArrayDeque<>();
//      q1.add("Airtel");
//      q1.add("vi");
//      q1.add("BSNL");
//      q1.add("jio");
//      
//      System.out.println(q1);
//      
//      q1.remove();
//      System.out.println(q1);
//      
//      System.out.println(q1.contains("vi"));
//      
//      System.out.println(q1.peek());
//      
//      System.out.println(q1.poll());
//      
//      System.out.println(q1);
		
		Queue<Integer> q2=new PriorityQueue<>();
		q2.add(10);
		q2.add(40);
		q2.add(30);
		
		 System.out.println(q2);
		 
	        while (!q2.isEmpty()) {
	            System.out.println(q2.poll());  
	        }
			 System.out.println(q2.isEmpty());


	}

}
