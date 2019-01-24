class Weather {
	public static void main(String[] arguments){
		float fahr = 86;
		float to_fahr;

		float to_cel;
		float cel = 32;

		to_cel = ((fahr - 32)/9) * 5;
		System.out.println("It is currently " + fahr + " degrees fahrenheit."
		);
		System.out.println(fahr + " degress fahrenheit in celsius is: " + 
			to_cel + "\n");

		to_fahr = ((cel * 9)/5) + 32;
		System.out.println(
			"It is currently " + cel + " degress celsius outside"
		);

		System.out.println(
			cel + " degress celsius in fahrenheit is: " + to_fahr + "\n"
		);
	}
}