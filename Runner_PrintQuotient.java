public class Runner_PrintQuotient {

	public Runner_PrintQuotient() {
		Quotient func = (numOne, numTwo) -> {
			float q = numOne/numTwo; 
			System.out.printf("%f%n", q);
		};
	}

	public static void main (String[]args) {
		Runner_PrintQuotient app = new Runner_PrintQuotient();
	}
	

}