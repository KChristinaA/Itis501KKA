public class main {
    public static void main(String[] args) {
        Matrix matrix1 = new SpecificMatrix(new double[][]{{1.0, 2.0, 4.0, 7.0}, {3.0, 5.0, 1.0, 0.0}, {5.0, 2.0, 8.0, 9.0}});
        System.out.println("Исходная матрица 1: ");
        matrix1.showing(matrix1);
        System.out.println("Умножение матрицы 1 на число 2: ");
        matrix1.showing(matrix1.multiply(2.0));
        System.out.println("Исходная матрица 2: ");
        Matrix matrix2 = new SpecificMatrix(new double[][]{{11.0, 12.0, 14.0, 17.0}, {13.0, 15.0, 11.0, 10.0}, {15.0, 12.0, 18.0, 19.0}});
        matrix2.showing(matrix2);
        System.out.println("Сумма матрицы 1 и матрицы 2: ");
        matrix1.showing(matrix1.add(matrix2));
        SpecificMatrix matrix3 = new SpecificMatrix(0, 0);
        System.out.println("Нулевая матрица: ");
        matrix3.showing(matrix3.createZeroMatrix(4, 3));
        System.out.println("Единичная матрица: ");
        matrix3.showing(matrix3.createOneMatrix(3));
        SquareMatrix matrix4 = new SquareMatrix(new double[][]{{4.0, 7.0}, {6.0, 3.0}});
        System.out.println("Исходная квадратная матрица: ");
        matrix4.showing(matrix4);
        System.out.println("След квадратной матрицы: " + matrix4.track());
        System.out.println();
        System.out.println("Обратная ей матрица: ");
        matrix4.showing(matrix4.inverseMatrix());
    }
}
