public class SquareMatrix extends SpecificMatrix {
    public SquareMatrix() {
        super(2, 2);
    }

    public SquareMatrix(double[][] matrix) {
        super(matrix);
    }

    public int track() {
        int result = 0;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                if (i == j) {
                    result += matrix[i][j];
                }
            }
        }
        return result;
    }

    public Matrix inverseMatrix() {
        SquareMatrix inverse = new SquareMatrix(matrix);
        double determinant = inverse.matrix[0][0] * inverse.matrix[1][1] - inverse.matrix[1][0] * inverse.matrix[0][1];
        if (determinant == 0) return null;
        double temporary1 = inverse.matrix[0][0];
        inverse.matrix[0][0] = inverse.matrix[1][1];
        inverse.matrix[1][1] = temporary1;
        inverse.matrix[0][1] = -inverse.matrix[0][1];
        inverse.matrix[1][0] = -inverse.matrix[1][0];
        return inverse.multiply(1.0/determinant);
    }
}
