package homework4;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(250);
        Horse pushok = new Horse("Pushok");
        Horse dragon = new Horse("WhiteDragon");


        myAccount.addMoney(50);
        System.out.println(myAccount.getBalanceInformation());
        Horse [] horses = {pushok, dragon};

        Bet bet = new Bet(200, pushok);

        HorseRace horseRace = new HorseRace(horses);

        Horse winner = horseRace.getHorseRaceResult();

        System.out.println(winner);
        System.out.println(pushok);
        System.out.println(dragon);
    }
}
