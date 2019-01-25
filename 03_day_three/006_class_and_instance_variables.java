class ClassAndInstance {
	public static void main(String[] arguments){
		/*
			Using Class and Instance Variables

			At this point, you can create your own object with class and 
			instance variables, but how do you work with those variables?
			They're used in largely the same manner as the local variables 
			you learned about yesterday. You can put them in expressions, 
			assign values to them in statements, and so on. You just refer 
			to them slightly differently. 
		*/

		/*
			Getting Values

			To get to the value of an instance variable, you use dot 
			notation, a form of addressing in which an instance or class 
			variable name has two parts: 

				- A reference to an object or class on the left side 
				of a dot operator. 
				- A variable on the right side. 

			Dot notation is how you refer to an object's instance variables 
			and methods. 

			For  example, if you refer to an object's instance varible called 
			orderTotal, here's how that variable could be refferred to in a 
			statement: 
		*/ 

			// accessing a class (object) instance variable 
			float total = customer.orderTotal;

		/*
			This statement assigns the value of the customer object's 
			'orderTotal' instance variable to a floating-point variable named 
			'total'.

			Accessing variables in dot notation is an expression (meaning 
			that it returns a value). Both sides of the dot also are expressions
			. This means that you can chain instance variable access. 

			Extending the preceding example, suppose the 'customer' object
			is an instance variable of the 'store' class. Dot notation 
			can be used twice, as in this statement: 
		*/ 
			// assigning chained instance variable access to total
			// store class superclass, customer subclass of store, 
			// orderTotal instance of customer class
			float total = store.customer.orderTotal;
	}
}