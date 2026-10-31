package phase1.basics;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TipCalculator {
	
	public String calculateTip(double billAmount, double tipPercentage) {
		
		BigDecimal bill = BigDecimal.valueOf(billAmount);
		BigDecimal tip = bill.multiply(BigDecimal.valueOf(tipPercentage))
		                     .divide(BigDecimal.valueOf(100));

		BigDecimal total = bill.add(tip)
		                       .setScale(2, RoundingMode.HALF_UP);

		return total.toString();
	}

}
