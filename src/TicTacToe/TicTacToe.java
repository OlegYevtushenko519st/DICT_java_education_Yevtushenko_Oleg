package TicTacToe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TicTacToe {

    public static void main(String[] args) {
        // Створюємо буферизований текстовий вхід
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Зчитуємо рядок від користувача
        String cells = "";
        try {
            cells = reader.readLine();
        } catch (Exception e) {
            cells = "";
        }

        // Друкуємо ігрове поле
        printBoard(cells);
    }

    private static void printBoard(String cells) {
        // Виводимо тире --------- над і під ігровою сіткою
        System.out.println("---------");

        // Друкуємо ігрову сітку
        for (int i = 0; i < cells.length(); i++) {
            System.out.print("| " + cells.charAt(i) + " ");
        }
        System.out.println("|");

        // Виводимо тире --------- під ігровою сіткою
        System.out.println("---------");
    }
}
