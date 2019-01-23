class Constants {
	/*
		Variables are useful when you need to store information that can be 
		changed as a program runs. 

		If the value never should change during a program's runtime, you can
		use a type of variable called a constant. A constant is a variable 
		with a value that never changes. (this might seem like an 
		oxymoron, given the meaning of the word "variable")

		Constants are useful in defining shared values for the use of all 
		methods of an object. In Java, you can create costants for all kinds 
		of variables: instants, class, and local. 

		To declare a constant, use the
	*/ 

	final; // keyword

	/*
		before the variable declaration and include an initial value for that 
		variable, as in the following: 
	*/ 

		final double PI = 3.141592;
		final boolean DEBUG = false; 
		final int PENALTY = 25;

	/*
		Constants can be handy for naming various states of an object an then 
		testing for those states. Suppose you have a program that takes
		directional input from the numeric keypad on the keyboard - press 
		8 to go up, 4 to go left, 6 to go right, and 2 to go down. You can 
		define those values as constant integers:
	*/ 

		final int LEFT = 4;
		final int RIGHT = 6;
		final int UP = 8; 
		final int DOWN = 2;
}