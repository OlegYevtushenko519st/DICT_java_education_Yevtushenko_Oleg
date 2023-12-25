package ChatBot;
import java.util.Scanner;

public class ChatBot {
    private static final String BOT_NAME = "MyJavaChatBot";
    private static final int YEAR_CREATED = 2023;
    public static void main(String[] args) {
        // Етап 1
        System.out.println("Hello! My name is " + BOT_NAME + ".");
        System.out.println("I was created in " + YEAR_CREATED + ".");

        // Етап 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, remind me your name.");
        String user_name = scanner.nextLine();
        System.out.println("What a great name you have, " + user_name + "!");

        // Етап 3
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int user_age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + user_age + "; that's a good time to start programming!");

        // Етап 4
        System.out.println("Now I will prove to you that I can count to any number you want!");
        int user_inp = scanner.nextInt();
        for (int i = 0; i <= user_inp; i++) {
            System.out.println(i + "!");
        }

        // Етап 5
        System.out.println("Let's test your programming skills.");
        String test_question = "What is the output of the following code?\n\npublic class Test { \n\n    public static void main(String[] args) { \n\n        int x = 3; \n\n        System.out.println(x * 2); \n\n    } \n\n} \n";
        int correct_answer = 6;
        while (true) {
            System.out.println(test_question);
            System.out.println("1. 3\n2. 6\n3. 9\n4. 12\nYour answer: ");
            int answer = scanner.nextInt();
            if (answer == correct_answer) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Incorrect. The correct answer is " + correct_answer + ".");
            }
        }

        System.out.println("Goodbye, have a nice day!");
    }
}
