package Matrix;

import java.util.Scanner;
public class Gofactor {

    static final int N = 2;


    static void getCofactor(int a[][], int temp[][],
                            int p, int q, int n)
    {
        int i = 0, j = 0;


        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {

                if (row != p && col != q) {
                    temp[i][j++] = a[row][col];

                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }


    static int determinantOfMatrix(int a[][], int n)
    {
        int D = 0;

        if (n == 1)
            return a[0][0];

        int temp[][] = new int[N][N];

        int sign = 1;

        for (int f = 0; f < n; f++) {
            getCofactor(a, temp, 0, f, n);
            D += sign * a[0][f]
                    * determinantOfMatrix(temp, n - 1);

            sign = -sign;
        }

        return D;
    }

    static void display(int a[][], int row, int col)
    {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(a[i][j]);

            System.out.print("\n");
        }
    }

    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int n,b;
        System.out.println("Enter size: ");
        n = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Enter number: ");
        int[][] a = new int[n][b];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] =scanner.nextInt();
            }
        }

        System.out.print("Determinant "
                + "of the matrix is : "
                + determinantOfMatrix(a, N));
    }
}
