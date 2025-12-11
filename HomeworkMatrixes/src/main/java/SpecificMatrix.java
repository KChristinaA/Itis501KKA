public class SpecificMatrix extends Matrix {
    public SpecificMatrix(int columns, int rows) {
        super(columns, rows);
    }

    public SpecificMatrix(double[][] matrix) {
        super(matrix);
    }

    public SpecificMatrix add(Matrix otherMatrix) {
        double[][] result = new double[this.rows][this.columns];
        if (this.rows != otherMatrix.rows || this.columns != otherMatrix.columns) {
            System.out.println("Размеры матриц не совпадают, невозможно выполнить сложение");
            return null;
        }
        for (int i = 0; i < result.length; ++i) {
            for (int j = 0; j < result[i].length; ++j) {
                result[i][j] = this.matrix[i][j] + otherMatrix.matrix[i][j];
            }
        }
        return new SpecificMatrix(result);
    }

    public SpecificMatrix multiply(double num) {
        double[][] result = new double[this.rows][this.columns];
        for (int i = 0; i < result.length; ++i) {
            for (int j = 0; j < result[i].length; ++j) {
                result[i][j] = this.matrix[i][j] * num;
            }
        }
        return new SpecificMatrix(result);
    }

    public static SpecificMatrix createZeroMatrix(int columns, int rows) {
        return new SpecificMatrix(columns, rows);
    }

    public static SpecificMatrix createOneMatrix(int rows) {
        SpecificMatrix result = new SpecificMatrix(rows, rows);
        for (int i = 0; i < rows; ++i) {
            result.matrix[i][i] = 1.0;
        }
        return result;
    }

    public void showing(Matrix matrix) {
        for (double[] x : matrix.matrix) {
            for (double j : x) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
