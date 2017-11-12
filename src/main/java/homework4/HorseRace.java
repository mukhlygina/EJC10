package homework4;

import java.util.ArrayList;

public class HorseRace {
    private ArrayList<Horse> horses;

    public HorseRace(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    public Horse getHorseRaceResult() {
        int speed = 0;
        Horse fastestHorse = null;
        for (Horse horse : this.horses) {
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
}
