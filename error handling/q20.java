// Design a Java program that performs matrix operations such as addition, multiplication,
// and transpose. Introduce scenarios, where accessing elements beyond the bounds of the
// matrix results in ArrayIndexOutOfBoundsException. Your task is to handle these
// exceptions effectively and provide meaningful error messages indicating the nature of
// the exception.
public class q20     {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};
        try {
            int[][] result = addMatrices(matrix1, matrix2);
            printMatrix(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
    }  

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
