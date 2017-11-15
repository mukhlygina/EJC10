package homework4;

public class Account {
    private int amountOfMoney;

    public Account(int money) {
        amountOfMoney = money;
    }

    public int getAccount() {
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

    public void showAccountInfo() {
        System.out.printf("Your account is %d$ %n", amountOfMoney);
    }
}
