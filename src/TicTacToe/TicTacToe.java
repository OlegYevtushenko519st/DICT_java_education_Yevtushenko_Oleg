package TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {
        // Створюємо масив для зберігання символів на ігровому полі
        char[][] board = new char[3][3];

        // Заповнюємо масив символами "X" і "O"
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (i + j) % 2 == 0 ? 'X' : 'O';
            }
        }

        // Друкуємо ігрове поле
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
