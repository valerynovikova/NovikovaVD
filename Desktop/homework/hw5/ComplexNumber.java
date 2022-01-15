public class ComplexNumber {
	private int x;
	private int y;
	
	public ComplexNumber() {
		this.x = 0;
		this.y = 0;
	}
	public ComplexNumber(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public ComplexNumber add(ComplexNumber number) {
		ComplexNumber number1 = new ComplexNumber(this.x + number.xthis.y + number.y ));
	    return number1;
	}
	public ComplexNumber sub(ComplexNumber number) {
		ComplexNumber number1 = new ComplexNumber(this.x - number.x,this.y - number.y);
		return number1;
	}
	public ComplexNumber mult(ComplexNumber number) {
		ComplexNumber number1 = new ComplexNumber((this.x * number.x) - (this.y * number.y),this.x * number.y + this.y * number.x);
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