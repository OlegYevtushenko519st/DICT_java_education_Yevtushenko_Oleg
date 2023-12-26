package CoffeMachine;

import java.util.Scanner;

public class Coffe {
    int water = 400 ,milk=540 ,coffee=120 ,cups = 9,money =550;
    public void buy(String enter){
        if (enter.equals("1")) {
            water = water - 250;
            coffee = coffee - 16;
            money += 4;
            cups -=1;
        }
        if (enter.equals("2")) {
            money += 7;
            water = water-350;
            milk = milk -75;
            coffee = coffee -20;
            cups -=1;
        }
        if (enter.equals("3")) {
            money += 6;
            water = water-350;
            milk = milk -100;
            coffee = coffee -12;
            cups -=1;
        }
    }
    public void take(String enter){
        System.out.println("I give you: "+money);
        money = 0;
    }
    public void fill(String enter){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter water: ");
        water = scanner.nextInt();
        System.out.println("Enter milk: ");
        milk = scanner.nextInt();
        System.out.println("Enter coffee: ");
        coffee = scanner.nextInt();
    }
    public void remaining(String enter){
        System.out.println("The coffee machine has:");
        System.out.println("Water: "+ water);
        System.out.println("Milk: "+milk);
        System.out.println("Coffee beans: "+coffee);
        System.out.println("Money: "+money);
        System.out.println("Cups: " + cups );
    }
}
