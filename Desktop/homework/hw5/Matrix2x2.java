public class Matrix2x2 {

    private double[][] matrix = new double[2][2];
    

    
    public Matrix2x2() {
        this.matrix[0][0] = 0;
		this.matrix[0][1] = 0;
		this.matrix[1][0] = 0;
		this.matrix[1][1] = 0;
	}
	public Matrix2x2(double matrix) {
		this.matrix[0][0] = matrix;
		this.matrix[0][1] = matrix;
		this.matrix[1][0] = matrix;
		this.matrix[1][1] = matrix;

    }
	public Matrix2x2(double[][] matrix) {
		this.matrix[][] = matrix;
	}
	public Matrix2x2(double matrix00,double matrix01,double matrix10,double matrix11) {
        this.matrix[0][0] = matrix00;
		this.matrix[0][1] = matrix01;
		this.matrix[1][0] = matrix10;
		this.matrix[1][1] = matrix11;
    
    }

 
}