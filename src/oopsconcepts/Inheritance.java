package oopsconcepts;

class Vehicle{
	public void horn() {
		System.out.println("Vehicle.horn()");
	}
	
	public void StartEngine() {
		System.out.println("vehcile.Startengine()");
	}
}

class Car extends Vehicle{
	  public void run() {
		  System.out.println("Car.horn");
	  }
	     public void stop() {
	    	 System.out.println("Car.stop");
	     }
}
    
class Swift extends Car{
	public void device() {
		System.out.println("we have a smart device");
	}
}

class Thar extends Car{
	public void device() {
		System.out.println("Playing music");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Swift s1 = new Swift();
		s1.StartEngine();
		s1.stop();
		s1.horn();
		s1.device();
		s1.run();
		
		System.out.println();
		
		Thar t1 = new Thar();
		t1.device();
		t1.run();
		t1.StartEngine();
		t1.stop();
		t1.horn();
	}

}
