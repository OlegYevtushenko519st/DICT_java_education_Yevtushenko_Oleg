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
    }
}
