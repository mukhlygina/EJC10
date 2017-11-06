package homework4;

public class Account {
    private int amountOfMoney;

    public Account(int money) {
        amountOfMoney = money;
    }

    public int getBalanceInformation() {
        return amountOfMoney;
    }

    public int addMoney(int money) {
        amountOfMoney += money;
        return amountOfMoney;
    }

    public int reduceMoney(int money) {
        amountOfMoney -= money;
        return amountOfMoney;
    }
}
