class DivideRemainder {
	public static void main(String[] arguments){
		float num1 = 26;
		float num2 = 5;
		float divided; 
		float remainder;

		System.out.println(
			"Your two numbers are: " + num1 + " and " + num2
		);

		divided = num1 / num2;
		System.out.println(
			num1 + " divided by " + num2 + " = " + divided
		);

		remainder = num1 % num2;
		System.out.println(
			num1 + " modulo " + num2 + " gives you a remainder of: " + remainder
		);
	}
}