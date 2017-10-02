package J1_urok6.atmexample;

public class MasterCard implements ICard {
    private int win;
    private int amount;
    private String cardholderName;

    // срок действия
    public MasterCard(int amount, String cardholderName) {
        this.amount = amount;
        this.cardholderName = cardholderName;
    }

    @Override
    public int getBalance() {
        return amount;
    }

    @Override
    public boolean withdraw(int amount) {
        if (amount <= this.amount) {
            this.amount -= amount;
            return true;
        } else {
            return false;

        }
    }
}

