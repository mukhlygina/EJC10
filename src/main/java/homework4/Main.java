package homework4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);
    static Account myAccount = new Account(250);
    static Horse pushok = new Horse("Pushok", 5);
    static Horse dragon = new Horse("Dragon", 4);
    static ArrayList<Horse> horses = new ArrayList<>();
    static Horse betHorse = null;

    public static void addHorsesForRace() {
        horses.add(pushok);
        horses.add(dragon);
    }

    public static Bet makeBet() {
        System.out.println("Please select horse: ");
        for(int i = 0; i<horses.size(); i++) {
            System.out.printf("select" + i + horses.get(i).getName());
        }
        int horseNumber = reader.nextInt();
        switch (horseNumber) {
            case 0:
                betHorse = pushok;
                break;
            case 1:
                betHorse = dragon;
                break;
        }
        System.out.println("Please set amount of money for the race");
        int money = reader.nextInt();
        Bet bet = new Bet(money, betHorse);
        System.out.printf("You have selected horse %s and your bid is %d$ %n", bet.getHorse().getName(), bet.getMoney());

        return bet;
    }

    public static void startRace(Bet bet) {
        if(bet != null) {
            HorseRace horseRace = new HorseRace(horses);
            Horse winner = horseRace.getHorseRaceResult();
            if (horseRace.checkBet(bet, winner, myAccount)) {
                System.out.println("You did it! Your account now " + myAccount.getBalanceInformation() + "$");
            } else {
                System.out.println("Maybe next time. Your account now " + myAccount.getBalanceInformation() + "$");
            }
            System.out.println("The winner is: ");
            System.out.println(winner);
            System.out.println(pushok);
            System.out.println(dragon);
        } else {
            System.out.println("Please make bet first!");
        }
    }

    public static void getAccountInfo() {
        System.out.printf("Your account is %d$ %n", myAccount.getBalanceInformation());
    }

    public static void main(String[] args) {
        addHorsesForRace();
        System.out.println("1 - Make bet");
        System.out.println("2 - Start race");
        System.out.println("3 - Show account balance");
        System.out.println("4 - Exit");
        Bet myBet = null;

        while (true) {
           int decision = reader.nextInt();
           switch (decision) {
               case 1 :
                   myBet = makeBet();
                   break;
               case 2 :
                   startRace(myBet);
                   break;
               case 3 :
                   getAccountInfo();
                   break;
               case 4 :
                   System.exit(0);
           }
        }
    }
}
