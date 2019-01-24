class Investment {
	public static void main(String[] arguments){
		/*
			Requirement: 

			1. Create a program that calculates how much a $14,000 
			investment would be worth if it increased in value by 40% during 
			the first year, lost $1,500 in value the second year, and 
			increased 12% in the third year. `
		*/ 

		float total = 14000; // total beginning 
		System.out.println("Your initial investment amount is: $" + total);
		total += total * .4F; // total + 40% first year
		System.out.println(
			"\nYour investment valued after 40% increase in the first year: $"
			+ total
		);

		total = total - 1500; // total decreasing $1500
		System.out.println(
			"\nYour investment valued after decreasing $1500: $" + total
		);

		total += total * .12F; // 12% third year increases
		System.out.println(
			"\nYour investment valued after 12% increase in the third year: $"
			+ total
		);
	}
}