package phase1.basics;

public class TempConverter {

	private double fTemp = 0d;
	private double cTemp = 0d;
	
	/*
	 * TempTypes: F for Farenheight, C for Celcius
	 */
	public TempConverter(double temp,String type) {
		
		if(type.equalsIgnoreCase(TempTypes.F.toString())) {
			fTemp = temp;
		}
		else if(type.equalsIgnoreCase(TempTypes.C.toString())) {
			cTemp=temp;
		}
	}
	
	enum TempTypes{
		F,
		C
	}
	
	public double convertTemp() {
		double result=0.0d;
		
		if(this.fTemp != 0) {
			result = (this.fTemp - 32d) * 5d/9d;

		}
		else {
			result = ((this.cTemp * 9d) / 5d) + 32d;
		}
		
		System.out.println(result);
		
		return Math.round(result * 100d)/100d;
	}
}