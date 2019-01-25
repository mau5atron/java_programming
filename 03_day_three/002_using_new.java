class UsingNew {
	public static void main(String[] arguments){
		/*
			To create a new object, you use the 'new' operator with the name 
			of the class that should be used as a template. The name of the 
			class is followed by parenthesis, as in these three examples: 
		*/ 

		String name = new String("Hal Jordan");
		URL address = new URL("http://www.java21days.com");
		MarsRobot robbie = new MarsRobot();

		/*
			The parenthesis are important and can't be omitted. They can be
			empty, however, in which case teh most simple, basic object of that class is created. The parenthesis also can contain arguments that 
			determine the values of instance variables or other initial 
			qualities of that object. 
		*/ 
		
		Random seed = new Random(445745346); 
		Point pt = new Point(0 ,0);

		/*
			The number and type of arguments to include inside the parenthesis
			are defined by the class itself using a special method called a 
			'constructor' (which is introduced later today). If you try to 
			create a new instance of a class wiht the wrong number or wrong type
			of arguments, or if you give it no arguments and it needs them, an 
			error occurs when the program is compiled. 

			Today's first project is a demonstration of creating different types
			of objects with different numbers and types of arguments. The 
			'StringTokenizer' class in the java.util package divides a string
			into a series of shorter strings called 'tokens'
	
			You divide a string into tokens by applying a character or
			characters as a delimiter. For example, the text "02/20/67" could
			be divided into three tokens ---- "02", "20", "67" --- using the
			slash character as a delimiter. 

			Today's first project is a Java application that uses string tokens
			to analyze stock prize data.
			*/ 
	}

}