package homework4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(250);
        Horse pushok = new Horse("Pushok");
        Horse dragon = new Horse("Dragon");

        myAccount.addMoney(50);
        System.out.println(myAccount.getBalanceInformation());

        Horse [] horses = {pushok, dragon};

        System.out.println("Please select horse: Pushok, Dragon");
        Scanner reader = new Scanner(System.in);
        String horseName = reader.next();

        System.out.println("Please set amount of money");
        int money = reader.nextInt();

        Bet bet = new Bet(money, horseName);

        HorseRace horseRace = new HorseRace(horses);

        Horse winner = horseRace.getHorseRaceResult();
        if(horseRace.checkBet(bet, winner.getName(), myAccount)) {
            System.out.println("You did it! Your account now " + myAccount.getBalanceInformation() + "$");
        } else {
            System.out.println("Maybe next time. Your account now " + myAccount.getBalanceInformation() + "$");
        }

        System.out.println("The winner is: ");
        System.out.println(winner);
        System.out.println(pushok);
        System.out.println(dragon);
    }
}
