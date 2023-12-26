package CoffeMachine;

import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String enter;
        Coffe coffee1 = new Coffe();
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            enter = scanner.nextLine();

            if (enter.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                enter = scanner.nextLine();
                coffee1.buy(enter);
            }
            if (enter.equals("take")) {
                coffee1.take(enter);

            }
            if (enter.equals("fill")) {
                coffee1.fill(enter);
            }
            if (enter.equals("remaining")){
                coffee1.remaining(enter);
            }
        }while (!enter.equals("exit"));

    }
}
