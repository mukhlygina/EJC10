package homework4;

public class Bet {
    private int money;
    private Horse horse;

    public Bet(int money, Horse horse) {
        this.money = money;
        this.horse = horse;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }
}
