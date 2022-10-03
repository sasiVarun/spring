package bankApplication;

public class LoanApplication {
	public static void main(String[] args) {
		TaxCalculatorFactory factory = new TaxCalculatorFactory();
//		NewLoanTaxCalculator calculator = factory.getObject();
		TaxCalculator calculator = factory.getObject();
		double rateOfInterest = calculator.getRateOfInterest();
		System.out.println("Rate of Interest: "+rateOfInterest);
	}
}
