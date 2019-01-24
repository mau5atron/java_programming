class StringLiterals {
	public static void main(String[] arguments){
		/*
			The final literal that you can use in a Java program represents a
			string of characters. A string in Java is an object rather than a
			primitive data type. Strings are not stored in arrays as they are 
			in languages such as C. 

			Because string objects are real objects in Java, methods are 
			available to combine strings, modify strings, and determine whether
			two strings have the same value. 

			String literals consist of a series of characters inside double
			quotation marks, as in the following statements: 
		*/ 

		String quitMsg = "Are you sure you want to quit?";

		String password = "drowssap";

		/*
			Giant Fat Ass Note™ 

			Although Java supports the transmission of Unicode characters, 
			a computer also must support it for the characters to be displayed
			when the program is run. Unicode support provides a way to encode
			its characters for systems that support the standard. Java supports
			the display of any Unicode character that can bbe represented by 
			a host font. 
		*/ 

		/*
			String literals are used similarly to other literas in Java, 
			however, they are handled differently behind the scenes. 

			With a string literal, Java stores that value as a String object. 
			You do not have to explicitly create a new object, as you must when
			working with other objects, so they are as easy to work with as 
			primitive data types. Strings are unusual in this respect - none 
			of the basic types are stored as an object when used.
		*/ 
	}
}