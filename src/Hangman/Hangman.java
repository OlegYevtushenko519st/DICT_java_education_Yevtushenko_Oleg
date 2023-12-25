package Hangman;
import java.util.Scanner;

public class Hangman {
    private static final String WORD = "python";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("HANGMAN");
        System.out.println("Guess the word:");

        String guess = scanner.nextLine();

        if (guess.equals(WORD)) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}
