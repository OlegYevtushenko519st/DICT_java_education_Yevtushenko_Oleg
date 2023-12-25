package Hangman;
import java.util.*;

public class Hangman {
    private static final List<String> WORDS = Arrays.asList("python", "java", "javascript", "kotlin");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("HANGMAN");

        // Вибір слова
        int wordIndex = new Random().nextInt(WORDS.size());
        String word = WORDS.get(wordIndex);

        // Гра
        int lives = 8;
        String guessedLetters = "";
        while (lives > 0) {
            // Відображення стану гри
            System.out.println("");
            System.out.println(word.substring(0, 2) + "-");
            System.out.println("Guessed letters: " + guessedLetters);

            // Введення букви
            System.out.print("Input a letter: ");
            String letter = scanner.nextLine();

            // Перевірка букви
            if (letter.length() != 1) {
                System.out.println("You should input a single letter.");
                continue;
            }
            if (!letter.matches("[a-z]")) {
                System.out.println("Please enter a lowercase English letter.");
                continue;
            }

            // Перевірка, чи буква зустрічається в слові
            boolean isCorrect = false;
            for (int i = 0; i < word.length(); i++) {
                if (letter.equals(word.charAt(i))) {
                    guessedLetters += letter;
                    word = word.replace(letter, "-");
                    isCorrect = true;
                }
            }

            // Зміна кількості життів
            if (!isCorrect) {
                lives--;
            }

            // Перевірка на перемогу
            if (word.equals(guessedLetters)) {
                System.out.println("You survived!");
                break;
            }
        }

        // Перевірка на поразку
        if (lives == 0) {
            System.out.println("You lost!");
        }
    }
}
