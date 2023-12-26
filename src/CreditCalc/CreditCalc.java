package CreditCalc;

import java.util.Scanner;
public class CreditCalc {
    public static void main(String[] args) {

        // Запитуємо у користувача суму кредиту
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the loan principal:");
        double principal = scanner.nextDouble();

        // Запитуємо у користувача, що потрібно розрахувати
        System.out.println("What do you want to calculate?");
        System.out.println("type 'm' – for number of monthly payments,");
        System.out.println("type 'p' – for the monthly payment:");
        char choice = scanner.next().charAt(0);

        // Обробляємо вибір користувача
        switch (choice) {
            case 'm': {
                // Обчислюємо кількість місяців
                System.out.println("Enter the monthly payment:");
                double payment = scanner.nextDouble();
                int months = (int) Math.ceil(principal / payment);
                System.out.println("It will take " + months + " months to repay the loan");
                break;
            }
            case 'p': {
                // Обчислюємо суму щомісячного платежу
                System.out.println("Enter the number of months:");
                int months = scanner.nextInt();
                double payment = principal / months;
                System.out.println("Your monthly payment = " + payment);

                // Обчислюємо останній платіж
                double lastPayment = principal - (months - 1) * payment;
                System.out.println("and the last payment = " + lastPayment);
                break;
            }
            default: {
                System.out.println("Unknown choice");
                break;
            }
        }
    }
}
