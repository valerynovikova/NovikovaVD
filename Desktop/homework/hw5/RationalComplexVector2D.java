import RationalComplexNumber;

public class RationalComplexVector2D {

    private RationalComplexNumber rationalnum1;
	private RationalComplexNumber rationalnum2;
	
	public RationalComplexVector2D() {
		this.rationalnum1 = 0;
		this.rationalnum2 = 0;
	}

    public RationalComplexVector2D(RationalComplexNumber rationalnum1, RationalComplexNumber rationalnum2) {
        this.rationalnum1 = rationalnum1;
		this.rationalnum2 = rationalnum2;
    }

    
    public RationalComplexVector2D add(RationalComplexVector2D vector) {
        RationalComplexVector2D vectorToReturn = new RationalComplexVector2D(this.rationalnum1 + vector.rationalnum1, this.rationalnum2 + vector.rationalnum2);
        return vectorToReturn;
    }

   

    
    @Override
    public String toString() {
        return "[" + rationalnum1 + ", " + rationalnum2 + "]";
    }

    
    public double length() {
        double result = Math.sqrt(Math.pow(rationalnum1, 2) + Math.pow(rationalnum2, 2));
        return result;
    }

    
    public double RationalComplexNumber scalarProduct(RationalComplexVector2D vector) {
        return ((this.rationalnum1 * vector.rationalnum1) + (this.rationalnum2 * vector.rationalnum2));
    }

   
    public boolean equals(RationalComplexVector2D vector) {
        if (this.rationalnum1 == vector.rationalnum1 && this.rationalnum2 == vector.rationalnum2) {
            return true;
        }
        return false;
    }
}