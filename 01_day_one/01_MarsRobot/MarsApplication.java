class MarsApplication{
	public static void main(String[] arguments){
		// declaring new MarsRobot object named spirit
		MarsRobot spirit = new MarsRobot(); 

		spirit.status = "exploring";
		spirit.speed = 2;
		spirit.temperature = -60;

		spirit.showAttributes();
		System.out.println("Increasing speed to 3.");
		spirit.speed = 3;
		spirit.showAttributes();
		System.out.println("Changing temperature to -90");
		spirit.temperature = -90;
		spirit.showAttributes();
		System.out.println("Checking the temperature.");
		spirit.checkTemperature();
		spirit.showAttributes();
	}
}

// When compiling app use: 
// javac ApplicationName.java
// ApplicationName.class will be created. 
// to run type 
// java ApplicationName / the .class extension will not be included 