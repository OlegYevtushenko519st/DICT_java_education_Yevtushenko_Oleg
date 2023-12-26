package Matrix;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Виведення меню
        System.out.println("1. Add matrices");
        System.out.println("2. Multiply matrix by a constant");
        System.out.println("3. Multiply matrices");
        System.out.println("0. Exit");

        // Зчитування вибору користувача
        int choice = scanner.nextInt();

        while (choice != 0) {
            // Зчитування даних для обраної операції
            switch (choice) {
                case 1:
                    // Додавання матриць
                    addMatrices(scanner);
                    break;
                case 2:
                    // Множення матриці на константу
                    multiplyMatrixByConstant(scanner);
                    break;
            }

            // Виведення меню
            System.out.println();
            System.out.println("1. Add matrices");
            System.out.println("2. Multiply matrix by a constant");
            System.out.println("3. Multiply matrices");
            System.out.println("0. Exit");

            // Зчитування вибору користувача
            choice = scanner.nextInt();
        }
    }

    // Додавання матриць
    private static void addMatrices(Scanner scanner) {
        // Зчитування розмірів матриць
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int n2 = scanner.nextInt();

        // Перевірка, чи можна додати матриці
        if (n1 != m2) {
            System.out.println("The operation cannot be performed.");
            return;
        }

        // Створення матриць
        double[][] matrix1 = new double[m1][n1];
        double[][] matrix2 = new double[m2][n2];

        // Зчитування матриць
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        // Додавання матриць
        double[][] result = new double[m1][n2];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Виведення результату
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Множення матриці на константу
    private static void multiplyMatrixByConstant(Scanner scanner) {
        // Зчитування розмірів матриці
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Створення матриці
        double[][] matrix = new double[m][n];

        // Зчитування матриці
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Множення матриці на константу
        double constant = scanner.nextDouble();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Множення елемента матриці на константу
                matrix[i][j] *= constant;
            }
        }

        // Виведення результату
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    }