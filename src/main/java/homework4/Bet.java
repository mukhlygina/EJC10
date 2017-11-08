package homework4;

public class Bet {
    private int money;
    private String horseName;

    public Bet(int money, String horseName) {
        this.money = money;
        this.horseName = horseName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getHorse() {
        return horseName;
    }

    public void setHorse(String horseName) {
        this.horseName = horseName;
    }
}
