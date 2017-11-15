package homework4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        HorseRace horseRace = new HorseRace();
        Account myAccount = new Account(250);
        Bet myBet = null;

        System.out.println("1 - Make bet");
        System.out.println("2 - Start race");
        System.out.println("3 - Show account balance");
        System.out.println("4 - Exit");

        while (true) {
            int decision = reader.nextInt();
            switch (decision) {
                case 1:
                    myBet = horseRace.makeBet();
                    break;
                case 2:
                    horseRace.startRace(myBet, myAccount);
                    break;
                case 3:
                    myAccount.showAccountInfo();
                    break;
                case 4:
                    return;
            }
        }
    }
}
