import java.util.StringTokenizer;

class TokenTester {
	public static void main(String[] arguments){
		StringTokenizer s1, s2; // declaring tokenized strings

		String quote1 = "GOO 530.80 -9.98";
		// string is tokenized based on its delimiter, which in this case
		// is the spacing in-between strings
		s1 = new StringTokenizer(quote1);
		System.out.println("Token 1: " + s1.nextToken());
		System.out.println("Token 2: " + s1.nextToken());
		System.out.println("Token 3: " + s1.nextToken() + "\n");

		String quote2 = "RHT@75.00@0.22";
		// string is tokenized based on its delimiter, which in this case we
		// are specifying is the '@' symbol
		s2 = new StringTokenizer(quote2, "@");
		System.out.println("Token 1: " + s2.nextToken());
		System.out.println("Token 2: " + s2.nextToken());
		System.out.println("Token 3: " + s2.nextToken());
	}
}