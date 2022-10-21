public class Atm {

    private int balance;
    private String pin;

    public Atm(int balance, String pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amountToDeposit) {
        balance += amountToDeposit;
    }

    public void withdraw(int amountToWithdraw) {
        if (amountToWithdraw <= balance) {
            balance -= amountToWithdraw;
        }else {
            System.out.println("Insufficient funds to make the withdraw, please try again");
        }
    }

    public boolean accessAccount(String pinEntered) {
        if (pinEntered.equals(pin)) {
            return true;
        } else {
            return false;
        }
    }
}
