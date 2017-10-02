package J1_urok6.atmexample;

public class Atm implements IAtm {
    private ICard currentCard; // выделили тип переменной

    @Override
    public void insertCard(ICard card) {
        currentCard = card;
    }

    @Override
    public void eject() {
        currentCard = null;
        System.out.println("Карту из банкомата извлекли");
    }

    @Override
    public void withdraw(int amount) {
        if (checkAvailableCard()) return; ;
        if (currentCard.withdraw(amount)) {
            System.out.println("Cash: " + amount + " , new balance: " + currentCard.getBalance());
            eject();
        } else {
            System.out.println("Not enough money ");
        }
    }

    private boolean checkAvailableCard() {
        if (currentCard == null) {
            System.out.println("Нет карточки");
            return true; //  как break для цикла
        }
        return false;
    }

    @Override
    public void getBalance() {
        if (checkAvailableCard()) return;
        System.out.println("Баланс " + currentCard.getBalance());
    }
}
