package Multithreading;

// Write a Java program to multiply two matrices using multithreading. Divide the task of
// multiplying rows of the matrices among multiple threads to improve performance.
public class Q3 {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] result = new int[matrix1.length][matrix2[0].length];
        Thread[] threads = new Thread[matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            int row = i;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix2.length; k++) {
                        result[row][j] += matrix1[row][k] * matrix2[k][j];
                    }
                }
            });
            threads[i].start();
        }
    }
}
