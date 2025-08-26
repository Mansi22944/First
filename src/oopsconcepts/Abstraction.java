package oopsconcepts;


 abstract class shape{
	 abstract void draw();
 }
 
     class Circle extends shape{
    	 void draw(){
    		 System.out.println("Drwaing a circle");
    	 }
     }
        
     class Rectangle extends shape{
    	 void draw() {
    		 System.out.println("Drawing a Rectangle");
    	 }
     }

public class Abstraction {

	public static void main(String[] args) {
	      shape s1 = new Circle();
	      s1.draw();
	      
	      shape s2 = new Rectangle();
	      s2.draw();

	}

}
