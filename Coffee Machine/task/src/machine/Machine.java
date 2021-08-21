package machine;

public class Machine {
    public static final String WATER_PROBLEM = "Sorry, not enough water!";
    public static final String MILK_PROBLEM = "Sorry, not enough milk!";
    public static final String BEANS_PROBLEM = "Sorry, not enough beans!";
    public static final String CUPS_PROBLEM = "Sorry, not enough cups!";
    public static final String SUCCESS = "I have enough resources, making you a coffee!";
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int cash;

    public Machine() {
        water = 400;
        milk = 540;
        beans = 120;
        cups = 9;
        cash = 550;
    }

    public void status() {
        System.out.println("\nThe coffee machine has:\n" + water + " ml of water\n" + milk + " ml of milk\n" + beans +
                " g of coffee beans\n" + cups + " disposable cups\n$" + cash + " of money");
    }

    public void makeEspresso() {
        if (water < 250) {
            System.out.println(WATER_PROBLEM);
        } else if (beans < 16) {
            System.out.println(BEANS_PROBLEM);
        } else if (cups < 1) {
            System.out.println(CUPS_PROBLEM);
        } else {
            water -= 250;
            beans -= 16;
            cups -= 1;
            cash += 4;
            System.out.println(SUCCESS);
        }
    }

    public void makeLatte() {
        if (water < 350) {
            System.out.println(WATER_PROBLEM);
        } else if (milk < 75) {
            System.out.println(MILK_PROBLEM);
        } else if (beans < 20) {
            System.out.println(BEANS_PROBLEM);
        } else if (cups < 1) {
            System.out.println(CUPS_PROBLEM);
        } else {
            water -= 350;
            milk -= 75;
            beans -= 20;
            cups -= 1;
            cash += 7;
            System.out.println(SUCCESS);
        }
    }

    public void makeCappuccino() {
        if (water < 200) {
            System.out.println(WATER_PROBLEM);
        } else if (milk < 100) {
            System.out.println(MILK_PROBLEM);
        } else if (beans < 12) {
            System.out.println(BEANS_PROBLEM);
        } else if (cups < 1) {
            System.out.println(CUPS_PROBLEM);
        } else {
            water -= 200;
            milk -= 100;
            beans -= 12;
            cups -= 1;
            cash += 6;
            System.out.println(SUCCESS);
        }
    }

    public void fill(int water, int milk, int beans, int cups) {
        this.water += water;
        this.milk += milk;
        this.beans += beans;
        this.cups += cups;
    }

    public void take() {
        System.out.println("I gave you $" + cash);
        cash = 0;
    }

}
