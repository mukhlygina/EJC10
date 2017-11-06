package homework4;

public class HorseRace {
    private Horse [] horses;

    public HorseRace(Horse [] horses) {
        this.horses = horses;
    }

    public Horse getHorseRaceResult() {
        int speed = 0;
        Horse fastestHorse = null;
        for (Horse horse : this.horses) {
            if(horse.getSpeed() > speed) {
                speed = horse.getSpeed();
                fastestHorse = horse;
            }
        }
        return fastestHorse;
    }

    public Horse makeBet(Horse horse, int money) {

        return horse;
    }
}
