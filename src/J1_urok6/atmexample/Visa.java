package J1_urok6.atmexample;

public class Visa implements ICard {
    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public boolean withdraw(int amount) {
        return false;
    }
}
