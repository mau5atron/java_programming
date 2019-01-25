class MemoryManagement {
	public static void main(String[] arguments){
		/*
			Note on Memory Management

			If you are familiar with other object-oriented languages, you 
			might wonder whether the new operator has an opposite that destroys 
			an object when it is no longer needed (or in use).

			Memory management in Java is dynamic and automatic. When you 
			create a new object, Java automatically allocates the proper 
			amount if memory for that object. You do not have to allocate any 
			memory for objects explicitly. The Java Virtual Machine (JVM)
			does it for you. 

			Because Java memory management is automatic, you don't need to 
			deallocate the memory an object uses when you're finished using it. 
			Under most circumstances, when you are finished with an object you 
			have created, Java can determine that the object no longer has 
			any live references to it. (In other words, the object is not 
			assigned to any variables still in use or stored in any arrays)

			As a program runs, the JVM periodically looks for unused objects 
			and reclaims the memory that those objects are using. This process
			is called "dynamic garbage collection" and occurs without any 
			programming on your part. You do not have to explicitly free the 
			memory taken up by an object; you just have to make sure that you're
			still not holding onto an object you want to get rid of. 

			This feature is one of the most touted advantages of the language 
			over its predecessor C++.
		*/ 
	}
}