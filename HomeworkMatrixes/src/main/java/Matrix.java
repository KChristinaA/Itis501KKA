public abstract class Matrix {
    protected int columns;
    protected int rows;
    protected double[][] matrix;

    public Matrix(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;
        this.matrix = new double[columns][rows];
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        columns = matrix[0].length;
        rows = matrix.length;
    }

    public abstract Matrix add(Matrix otherMatrix);

    public abstract Matrix multiply(double num);

//    public static Matrix createZeroMatrix(int columns, int rows) {
//        return new SpecificMatrix(columns, rows);
//    }
//
//    public static Matrix createOneMatrix(int rows) {
//        Matrix result = new SpecificMatrix(rows, rows);
//        for (int i = 0; i < rows; ++i) {
//            result.matrix[i][i] = 1.0;
//        }
//        return result;
//    }

    public abstract void showing(Matrix matrix);
}
