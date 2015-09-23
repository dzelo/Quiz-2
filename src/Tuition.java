import java.util.Scanner;

public class Tuition {

	// Declaration of variables
	
	private double tuition;
	private double interest;
	private double years;
	private double apr;
	
	
	public Tuition(){
		
		//Constructor method
		
	};

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);    // scanner to read user input

		Tuition test = new Tuition();  // creation of Tuition instance
		
		// Prompting user to input values for instance of Tuition
		
		System.out.println("Please input tuition cost: \n");
		test.tuition = input.nextDouble();

		System.out.println("Please input tuition interest rate as decimal: \n");
		test.interest = input.nextDouble();

		System.out.println("Please input years to make payments: \n");
		test.years = input.nextDouble();

		System.out.println("Please input APR as decimal: \n");
		test.apr = input.nextDouble();
		
		double var = test.tuition;   //placeholder variable
		
		for (int i = 1; i< 4; i++){ 				// calculates final tuition cost after 4 years
			var = var + (var * (test.interest));
			test.tuition += var;
		}
		double monthlyPayment;
		double months = test.years * 12;
		
				// calculates monthly payment based off of input
		monthlyPayment = ((test.apr/12) + ((test.apr/12) / (Math.pow((1 + (test.apr/12)), (months) - 1)))) * test.tuition;
		
		System.out.printf("Your monthly payments will be : %.2f",monthlyPayment);    //formatted print to 2 decimals
	}
}
