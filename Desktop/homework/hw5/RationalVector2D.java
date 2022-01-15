import RationalFraction;

public class RationalVector2D {

    private RationalFraction rationalnum1;
	private RationalFraction rationalnum2;
	
	public RationalVector2D() {
		this.rationalnum1 = 0;
		this.rationalnum2 = 0;
	}

    public RationalVector2D(RationalFraction rationalnum1, RationalFraction rationalnum2) {
        this.rationalnum1 = rationalnum1;
		this.rationalnum2 = rationalnum2;
    }

    
    public RationalVector2D add(RationalVector2D vector) {
        RationalVector2D vectorToReturn = new RationalVector2D(this.rationalnum1 + vector.rationalnum1, this.rationalnum2 + vector.rationalnum2);
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

    
    public double RationalFraction scalarProduct(RationalVector2D vector) {
        return ((this.rationalnum1 * vector.rationalnum1) + (this.rationalnum2 * vector.rationalnum2));
    }

   
    public boolean equals(RationalVector2D vector) {
        if (this.rationalnum1 == vector.rationalnum1 && this.rationalnum2 == vector.rationalnum2) {
            return true;
        }
        return false;
    }
}