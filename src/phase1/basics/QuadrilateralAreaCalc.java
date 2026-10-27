package phase1.basics;

/*
 * Given the length and the width
 */
public class QuadrilateralAreaCalc {
	
	private double length;
	private double width;
	
	@SuppressWarnings("unused")
	private QuadrilateralAreaCalc() {
		
	}
	
	public QuadrilateralAreaCalc(double length, double width) {
		this.length = length;
		this.width = width;
		
		
	}
	
	public double GetArea() {
		
		return Math.round(this.length * this.width * 100.0) / 100.0;
		
	}
	
	public double GetPerimeter() {
		
		return Math.round((this.length + this.width) * 2.0 * 100.0) / 100.0;
		
	}

}
