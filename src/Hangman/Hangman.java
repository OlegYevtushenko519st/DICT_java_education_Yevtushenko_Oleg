package Hangman;

import java.util.*;

public class Hangman {

    private static final String[] WORDS = {"python", "java", "javascript", "kotlin"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Меню гри
        String input;
        do {
            System.out.println("HANGMAN");
            System.out.println("Введіть 'play', щоб почати гру, або 'exit', щоб вийти:");
            input = scanner.nextLine();

            if (input.equals("play")) {
                playGame(scanner);
            } else if (input.equals("exit")) {
                System.out.println("Дякуємо за гру!");
            } else {
                System.out.println("Неправильний ввід. Спробуйте ще раз.");
            }
        } while (!input.equals("exit"));
    }

    private static void playGame(Scanner scanner) {
        // Вибір слова для гри
        int randomIndex = (int) (Math.random() * WORDS.length);
        String word = WORDS[randomIndex];

        // Створення масиву для зберігання вгаданих букв
        char[] guessedLetters = new char[word.length()];
        Arrays.fill(guessedLetters, '-');

        // Счётчик помилок
        int mistakes = 0;

        // Цикл гри
        while (mistakes < 8) {
            // Виведення загаданого слова з вгаданими буквами
            System.out.println("Загадане слово: " + new String(guessedLetters));

            // Введення букви від гравця
            System.out.println("Введіть букву:");
            String letter = scanner.nextLine().toLowerCase();

            // Перевірка введення
            if (letter.length() != 1) {
                System.out.println("Введіть одну букву.");
                continue;
            }

            // Перевірка, чи буква вже вгадувалася
            if (contains(guessedLetters, letter.charAt(0))) {
                System.out.println("Цю букву ви вже вгадували.");
                continue;
            }

            // Перевірка, чи буква є в загаданому слові
            if (word.indexOf(letter.charAt(0)) == -1) {
                mistakes++;
                System.out.println("Ця буква не входить до слова.");
            } else {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == letter.charAt(0)) {
                        guessedLetters[i] = letter.charAt(0);
                    }
                }
            }

            // Перевірка, чи гравець вгадав слово
            if (Arrays.equals(guessedLetters, word.toCharArray())) {
                System.out.println("Ви вгадали слово! Ви вижили!");
                break;
            }
        }

        // Гра закінчилася
        if (mistakes == 8) {
            System.out.println("Ви програли!");
        }
    }

    private static boolean contains(char[] array, char c) {
        for (char letter : array) {
            if (letter == c) {
                return true;
            }
        }

        return false;
    }
}