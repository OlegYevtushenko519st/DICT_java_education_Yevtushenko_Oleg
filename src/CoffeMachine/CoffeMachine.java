package CoffeMachine;

import java.util.Scanner;

public class CoffeMachine {

    static int money = 1000;
    static int water = 600;
    static int milk = 400;
    static int beans = 200;
    static int disposableCups = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = " ";
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            action = scanner.next();

            switch (action) {
                case "buy":
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String choice = scanner.next();
                    switch (choice) {
                        case "1":
                            if (water >= 250 && beans >= 16 && disposableCups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water = water - 250;
                                beans = beans - 16;
                                money = money + 4;
                                disposableCups = disposableCups - 1;

                            } else if (water < 250) {
                                System.out.println("Sorry, not enough water!");

                            } else if (beans < 16) {
                                System.out.println("Sorry, not enough beans!");

                            } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                            break;
                        case "back":
                            break;
                        default:
                            break;
                    }
                    break;

                case "fill":
                    System.out.print("Write how many ml of water do you want to add: ");
                    water = water + scanner.nextInt();
                    System.out.print("Write how many ml of milk do you want to add: ");
                    milk = milk + scanner.nextInt();
                    System.out.print("Write how many grams of coffee beans do you want to add: ");
                    beans = beans + scanner.nextInt();
                    System.out.print("Write how many disposable cups of coffee do you want to add: ");
                    disposableCups = disposableCups + scanner.nextInt();

                    break;

                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;

                    break;
                case "remaining":

                    printStatus();

                    break;
                default:
                    break;


            }
        }
    private static void printStatus() {

        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }
}
