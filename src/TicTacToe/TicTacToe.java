package TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {
        // Створюємо масив для зберігання символів на ігровому полі
        char[][] board = new char[3][3];

        // Зчитуємо рядок від користувача
        System.out.print("Enter cells: ");
        String cells = System.console().readLine();

        // Перетворюємо рядок у масив символів
        for (int i = 0; i < cells.length(); i++) {
            board[i / 3][i % 3] = cells.charAt(i);
        }

        // Друкуємо ігрове поле
        printBoard(board);
    }

    private static void printBoard(char[][] board) {
        // Виводимо тире --------- над і під ігровою сіткою
        System.out.println("---------");

        // Друкуємо ігрову сітку
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }

        // Виводимо тире --------- під ігровою сіткою
        System.out.println("---------");
    }
}
