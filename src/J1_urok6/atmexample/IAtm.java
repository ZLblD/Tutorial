package J1_urok6.atmexample;

// банкомат
public interface IAtm {
    void insertCard(ICard card); // вставили карту

    void eject();  // изъяли карту

    void withdraw(int amount);

//    void checkPin();

    void getBalance();

//    void getTransactions();
}
