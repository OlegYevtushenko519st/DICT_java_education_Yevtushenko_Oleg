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
    }
}
