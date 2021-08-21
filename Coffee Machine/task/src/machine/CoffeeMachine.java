package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static boolean isRunning = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Machine machine = new Machine();
        while (isRunning) {
            mainMenu(scanner, machine);
        }
    }

    private static void mainMenu(Scanner scanner, Machine machine) {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        String input = scanner.nextLine();
        switch (input) {
            case "buy":
                buyingChoice(scanner, machine);
                break;
            case "fill":
                fillSettings(scanner, machine);
                break;
            case "take":
                machine.take();
                break;
            case "remaining":
                machine.status();
                break;
            case "exit":
                isRunning = false;
                break;
            default:
                break;
        }
    }

    private static void fillSettings(Scanner scanner, Machine machine) {
        System.out.println("\nWrite how many ml of water you want to add:");
        int water = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many ml of milk you want to add:");
        int milk = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many grams of coffee beans you want to add:");
        int beans = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int cups = Integer.parseInt(scanner.nextLine());
        machine.fill(water, milk, beans, cups);
    }

    private static void buyingChoice(Scanner scanner, Machine machine) {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                machine.makeEspresso();
                break;
            case "2":
                machine.makeLatte();
                break;
            case "3":
                machine.makeCappuccino();
                break;
            case "back":
                mainMenu(scanner, machine);
                break;
            default:
                break;
        }
    }
}
