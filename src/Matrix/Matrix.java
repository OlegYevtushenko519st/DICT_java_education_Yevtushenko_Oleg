package Matrix;

import java.util.Scanner;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[0][];
        double[][] matrix1=new double[0][];
        String enter;

        System.out.println("1.Add matrices");
        System.out.println("2.Multiply matrix by a constant");
        System.out.println("3.Multiply matrices");
        System.out.println("4.Transpose matrix");
        System.out.println("5.Calculate a determinant");
        System.out.println("6.Inverse matrix");
        System.out.println("0.Exit");
        do {

            enter = scanner.nextLine();

            if (enter.equals("1")) {
                System.out.println("First matrix");
                double num = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                matrix = new double[(int) num][(int) num2];


                System.out.println("First matrix");
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix[i][j] = scanner.nextDouble();
                    }
                    System.out.println();
                }
                System.out.println("Second matrix");
                double num3 = scanner.nextDouble();
                double num4 = scanner.nextDouble();
                matrix1 = new double[(int) num3][(int) num4];
                System.out.println("Second matrix");
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix1[i].length; j++) {
                        matrix1[i][j] = scanner.nextDouble();
                    }
                    System.out.println();
                }
            }
            if (enter.equals("2")) {

                System.out.println("Enter count: ");
                int count = scanner.nextInt();
                System.out.println("Result ");
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] *= count);
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }

            if (enter.equals("3")) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] *= matrix1[i][j]);
                        System.out.print(" ");

                    }
                    System.out.println();
                }
            }
            if (enter.equals("4")){
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

                // часть 2 - выводит на экран начальную матрицу
                System.out.println("Start matrix");
                System.out.println("------");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.printf("%4d", a[i][j]);
                    }
                    System.out.println();
                }

                // часть 3 - транспонирование матрицы
                for (int i = 0; i < n; i++) {
                    for (int j = i+1; j < n; j++) {
                        int temp = a[i][j];
                        a[i][j] = a[j][i];
                        a[j][i] = temp;
                    }
                }

                // часть 4 - выводит на экран транспонированную матрицу
                System.out.println();
                System.out.println("Transpose matrix");
                System.out.println("------");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.printf("%3d", a[i][j]);
                    }
                    System.out.println();
                }
            }

            if (enter.equals("5")){
                Gofactor.main();
            }
            if (enter.equals("6")){
                Invers.main();

            }
        }while (!enter.equals("0"));


    }
}