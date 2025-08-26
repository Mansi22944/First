package oopsconcepts;

class Task{
	public void sum(int a,int b) {
		System.out.println("sum");
		System.out.println(a+b);
	}

    public void sum(int a, double b) {
    	System.out.println("sum");
    	System.out.println(a+b);
    }
    
    public void sum(int a,int b,int c) {
    	System.out.println("sum");
    	System.out.println(a+b+c);
    }
    public void sum(double a,double b) {
    	System.out.println("sum");
    	System.out.println(a+b);
    }
}

public class polymorphism {

	public static void main(String[] args) {
		Task t = new Task();
		t.sum(5, 9);
		t.sum(9,9.5);
		t.sum(2, 3,7);
		t.sum(7.5,8.5);
	}

}
