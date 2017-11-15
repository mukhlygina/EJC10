package homework4;

import java.util.ArrayList;
import java.util.Scanner;

public class HorseRace {
    private ArrayList<Horse> horses = new ArrayList<>();
    Horse pushok = new Horse("Pushok", 5);
    Horse dragon = new Horse("Dragon", 4);
    Scanner reader = new Scanner(System.in);

    public HorseRace() {
        horses.add(pushok);
        horses.add(dragon);
    }

    public HorseRace(ArrayList<Horse> horses) {
       this.horses = horses;
    }

    public int selectHorseNumber() {
        System.out.println("Please select horse: ");
        for (int i = 0; i < horses.size(); i++) {
            System.out.printf("%d %s %n", i, horses.get(i).getName());
        }
        return reader.nextInt();
    }

    public Horse selectHorse() {
        int horseNumber = selectHorseNumber();
        if (horseNumber >= 0 && horseNumber < horses.size()) {
            return horses.get(horseNumber);
        } else {
            throw new IllegalArgumentException("Wrong horse number!");
        }
    }

    public int selectMoney() {
        System.out.println("Please set amount of money for the race");
        return reader.nextInt();
    }

    public Bet makeBet() {
        Horse betHorse = selectHorse();
        int money = selectMoney();
        Bet bet = new Bet(money, betHorse);
        System.out.printf("You have selected horse %s and your bid is %d$ %n", bet.getHorse().getName(), bet.getMoney());
        return bet;
    }

    public Horse getHorseRaceResult(ArrayList<Horse> horsesToCheck) {
        int speed = 0;
        Horse fastestHorse = null;
        for (Horse horse : horsesToCheck) {
            if (horse.getSpeed() > speed) {
                speed = horse.getSpeed();
                fastestHorse = horse;
            }
        }
        return fastestHorse;
    }

    public boolean checkBet(Bet bet, Horse winner, Account account) {
        boolean isWinner = false;
        if (bet.getHorse().getName().equals(winner.getName())) {
            account.addMoney(bet.getMoney());
            isWinner = true;
        } else {
            account.reduceMoney(bet.getMoney());
        }
        return isWinner;
    }

    public void startRace(Bet bet, Account account) {
        if (bet != null) {
            Horse winner = getHorseRaceResult(horses);
            if (checkBet(bet, winner, account)) {
                System.out.println("You did it! Your account now " + account.getAccount() + "$");
            } else {
                System.out.println("Maybe next time. Your account now " + account.getAccount() + "$");
            }
            System.out.println("The winner is: ");
            System.out.println(winner);
            System.out.println("All horses: ");
            System.out.println(pushok);
            System.out.println(dragon);
        } else {
            System.out.println("Please make bet first!");
        }
    }
}
