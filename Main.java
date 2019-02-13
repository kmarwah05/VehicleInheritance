package VehicleInheritance;

/*
 * - Start with a base class of Vehicle, then create a Car class that inherits from this base class
 * - Finally, create another class, a specific type of Car that inherits from the Car class
 * - You should be able to handle steering, changing gears, and moving (speed in other words)
 * - You will want to decide where to put the appropriate state and behaviors(fields and methods)
 * - As mentioned above, changing gears, increasing/decreasing speed should be included
 * - For your specific type of vehicle you will want to add something specific for that type of car 
 */


public class Main {

	public static void main(String[] args) {
		BMW bmw = new BMW(36);
		bmw.accelerate(30);
		
		System.out.println("---------------------------");
		
		bmw.accelerate(20);
		
		System.out.println("---------------------------");
		
		bmw.steer(45);
		
		System.out.println("---------------------------");

		bmw.accelerate(-45);

		
	}

}
