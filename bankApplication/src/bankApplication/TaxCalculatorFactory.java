package bankApplication;

import java.io.BufferedReader;
import java.io.FileReader;

public class TaxCalculatorFactory {

//	public NewLoanTaxCalculator getObject() {
//		NewLoanTaxCalculator calculator = new NewLoanTaxCalculator();
//		return calculator;
//	}
	
	@SuppressWarnings("deprecation")
	public TaxCalculator getObject() {
//		TaxCalculator calculator = new AdvancedLoanTaxCalculator();
		TaxCalculator calculator = null;
		BufferedReader br = null;
		FileReader fr = null;
		try {
//			String className = "bankApplication.NewLoanTaxCalculator";
			fr = new FileReader("properties.txt");
			br = new BufferedReader(fr);
			String className = br.readLine();
			calculator = (TaxCalculator) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return calculator;
	}
}
