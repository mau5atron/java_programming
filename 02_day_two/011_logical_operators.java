class LogicalOperators {
	public static void main(String[] arguments){
		/*
			Expressions that result in Boolean values, such as comparison 
			operations, can be combined to form more complex expressions. This
			is handled through logical operators, which are used for the logical
			combinations AND, OR, XOR, and logical NOT. 

			For AND combinations, the & or && logical operator is used. When
			two bboolean expressions are linked by these operators,
			the combined expression returns a true value only if both 
			Boolean expressions are true. 
		*/ 

		boolean extraLife = (score > 75000) & (playerLives < 10);

		/*
			& single evaluates both sides no matter what 
			&& evaluates the left and if false does not evaluate the right side

			&& seems more efficient 
		*/ 

		/*
			Note the use of || instead of |. Becuase of this usage, if 
			score > 75000 is true, extraLife is set to true, and the second
			expression is never evaluated. 
		*/ 

		// Operator Precedence
		/*
			In general, the order of evaluation from first to last is as 
			follows: 

			1. Increment and decrement operations 
			2. Arithmetic 
			3. Comparisons 
			4. Logical operations 
			5. Assignment expressions
		*/

		/*
			Specific Precedence Table 

			Operator 							Notes
			________ 							_____	

			. [] ()								A period . is used for access to methods and
														variables within objects and classes. Square
														brackets [] are used for arrays. 
														Parenthesis () are used to group expressions. 

			++ -- ! ~ instanceof  The instanceof operator returns true or false
														based on whether the object is an instance of
														the named class or any of that class's 
														subclasses. 

			new (type)expression  The new operator is used to create new 
														instances of classes. The parenthesis in 
														this case are for casting a value to another
														type. 

			* / % 								Multiplication, division, modulus 

			+ - 									Addition, subtraction

			<< >> >>>							Bitwise left and right shift 

			== != 								Equality, not equal 

			& 										AND 

			^ 										XOR 

			| 										OR

			&& 										Logical AND

			||										Logical OR

			? : 									Ternary operator 

			= += -= *= /= %= ^= 	Assignments 

			&= |= <<= >>= >>>= 		More assignments 
		*/ 

		/*
			Certification Practice 

			1. Which of the following is a valid value for a boolean variable? 
				- B. false

			2. Which of these is NOT a convention for naming variables in Java?
				- C. All letters are capitalized 

			3. Which of these data types holds numbers from -32,768 to 
			32,767?

			- C. short 
		*/ 
	}
}