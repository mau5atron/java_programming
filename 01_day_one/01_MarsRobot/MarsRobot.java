class MarsRobot {
	String status; // declaring string status 
	int speed; // declaring integer speed 
	float temperature; // declaring float temperature

	void checkTemperature(){ // method to check temperature 
		if(temperature < -80){
			status = "returning home im pwussy :(";
			speed = 5;
		}
	}

	void showAttributes(){ // method for printing out attributes
		System.out.println("Status: " + status);
		System.out.println("Speed: " + speed);
		System.out.println("Temperature: " + temperature);
	}
}

/*
	Running the program. 

	Even the MarsRobot was compiled correctly into a class, you can't do
	anything with it. The class you have crated defines what a MarsRobot
	object is like, but it does not actyally create one of these objects. 

	There are two ways to put the MarsRobot class to use. 

	Create a separate Java program that creates an object belonging to that
	class. 

	Add a special class method called main() to the MarsRobot class so that 
	it can be run as an application.
*/