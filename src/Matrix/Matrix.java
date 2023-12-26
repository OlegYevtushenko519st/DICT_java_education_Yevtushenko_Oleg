package Matrix;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        int c = scanner.nextInt();

        int[][] C = multiplyMatrixByConstant(A, c);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] multiplyMatrixByConstant(int[][] A, int c) {
        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = c * A[i][j];
            }
        }

        return C;
    }
}