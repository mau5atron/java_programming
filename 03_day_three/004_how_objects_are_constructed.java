class ObjectsAndConstructor {
	public static void main(String[] arguments){
		/*
			Several things happen when you use the new operator. The new 
			instance of the given class is created, memory is allocated for it, 
			and a special method defined in the given class is called. This
			method is called a constructor. 

			A constructor is a way to create a new instance of a class. A 
			constructor initializes the new object and its variables, creates
			any other objects that the object needs, and performs any additional
			operations the object requires to initialize itself. 

			A class can have several different constructors, each with a 
			different number or type of argument. When you use 'new', you can 
			specify different arguments in the argument list, and the correct
			constructor for those arguments is called. 

			In the tokenTester project, multiple constructor definitions 
			enabled the StringTokenizer class to accomplish different things 
			with different uses of the 'new' operator. When you create your own
			classes, you can define as many constructors as you need to 
			implement the behaviour of the class. 

			No two constructors in a class can have the same number and type of 
			arguments, because this is the only way constructors are 
			differentiated from each other. 

			If a class has no constructors, a constructor with no arguments is 
			called by default when an object of the class is created. The only 
			thing this constructor does is call the sae constructor in its superclass. 
		*/ 

		/*
			CAUTION DUMB BITCH

			The default constructor only exists in a class that has not defined
			any constructors. Once you define at least one constructor in a 
			class, you can't count on there being a default constructor with 
			no arguments. 
		*/ 
	}
}