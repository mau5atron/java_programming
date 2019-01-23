class interfaces {
	/*
		Single inheritance makes the relationship between classes and the 
		functionality they implement easier to understand and design. 

		However, it can also be restrictive, especially when you have 
		similar behaviour that needs to be duplicated across different
		branches of a class hierchy. Java solves the problem of shared behaviour by using interfaces. 

		An interface is a collection of methods that indicate a class 
		has some behaviour in addition to what it inherit fro m its 
		superclasses. The methods  include in an interface do not define 
		this behaviour; that task is left for the classes that implement
		the interface. 

		Example: The 'Comparable' interface contains a method that compares 
		two objects of the same class to see which one should appear first in 
		a sorted list. Any class that implements this interface shows other 
		objects that it knows how to determine the sorting order for 
		objects of that class. This behaviour would be unnavailable to the
		class without the interface. 	
	*/ 
}