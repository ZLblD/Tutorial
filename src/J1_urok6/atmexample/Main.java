package J1_urok6.atmexample;

public class Main {
    public static void main(String[] args) {
        IAtm superAtm = new Atm();
        ICard superCard = new MasterCard(1000, "Байр");

        superAtm.insertCard(superCard);
        superAtm.getBalance();
        superAtm.withdraw(900);
        superAtm.withdraw(200);
        superAtm.getBalance();

        superAtm.insertCard(superCard);
        superAtm.withdraw(200);
        superAtm.getBalance();

    }
}
