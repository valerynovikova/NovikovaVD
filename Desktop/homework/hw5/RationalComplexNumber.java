import RationalFraction;

public class RationalComplexNumber {
	private RationalFraction x;
	private RationalFraction y;
	
	public RationalComplexNumber() {
		this.x = 0;
		this.y = 0;
	}
	public RationalComplexNumber(RationalFraction x, RationalFraction y) {
		this.x = x;
		this.y = y;
	}
	public RationalComplexNumber add(RationalComplexNumber number) {
		RationalComplexNumber number1 = new RationalComplexNumber (this.x + number.x,this.y + number.y );;
	    return number1;
	}
	public RationalComplexNumber sub(RationalComplexNumber number) {
		RationalComplexNumber number1 = new RationalComplexNumber(this.x - number.x,this.y - number.y);
		return number1;
	}
	public RationalComplexNumber mult(RationalComplexNumber number) {
		RationalComplexNumber number1 = new RationalComplexNumber ((this.x * number.x) - (this.y * number.y),this.x * number.y + this.y * number.x);;
        return number1;
    }
	public String toString() {
		if (this.x == 0 && this.y == 0) {
			return "0";
		} else if (this.x == 0) {
			return y + "i";
		} else if (this.y == 0) {
			return x + "i";
		} else {
			return x + y + "i";
		}
	}
}