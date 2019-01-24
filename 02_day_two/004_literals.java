class literals {
	public static void main(String[] arguments){
		/*
			In addition to variables, you can work with values as literals in
			a java statement. A 'literal' is any number, text, or other 
			information that directly represents a value. 
		*/ 
		// The following assignment statement uses a literal: 
		int year = 2019;

		/*
			Teh literal 2019 represents the integer value 2019. Numbers, 
			characters, and strings are all examples of literals. Java has 
			types of literals that represent different kinds of numbers, 
			characters, strings, and Boolean values. 
		*/ 

		// Number literals
		/*
			Java has several integer literals. The number 4, for eample, is an
			integer literal of th int variable type. It can also be assigned 
			to 'byte' and 'short' variables, because the number is small enough
			to fit into those integer types. An integer larger than an 'int'
			can hold automatically is considered to be of the type 'long'

			You can also indicate that a literal should be a 'long' integer by
			adding the letter L to the number (either in upper or lowercase.) 
		*/ 

		pennyTotal = pennyTotal + 4L; // add 4 long to pennyTotal and 
		// reassign it again 

		/*
			This statement adds the value 4, formatted as a long, to the 
			current value of the pennyTotal variable. 
		*/ 

		/*
			Floating-Point Literals

			Floating point literals use a period character, for the decimal 
			point. 

			The following statement uses a literal to set up a double 
			variable: 
		*/ 

		double gpa = 3.55;

		/*
			All floating-point literal are considered to be of the 'double' 
			variable type instead of 'float'. To specify a literal 'float' 
		, add the letter F to the literal (upper- or lowercase),
		as in the following example: 
		*/ 

		float piValue = 3.1415927F;

		/*
		You can use exponents in floating point literals by using the letter 
		e or E followed by the exponent, which can be a negative number. 
		Th following statements use exonential notation: 
		*/ 

		double x = 12e22;
		double y = 19E-95;

		/*
			A large integer literal can include an underscore character _ to 
			make it more readable to humans. The underscore serves the same 
			purpose as a comma in a large number, making its value more 
			apparent. Consider these two examples, one of which uses underscores
		*/ 

		int jackpot = 3500000;
		int jackpot = 3_500_000;


	}
}