package Shild.Interface.ex8_1;

/**
 * Created by TEHOTD7 on 14.07.2017.
 */
// фиксированная очередь
// Класс, реализующий очередь фиксированного размера
// для хранения символов

public class FixedQueue implements ICharQ {
    private char q[];   // массив для хранения элементов очереди
    private int putloc; // индекс вставляемых элементов
    private int getloc; // индекс извлекаемых элементов

    // Создаь пустую очередь заданного размера
    public FixedQueue(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    @Override
    // Поместить символ в очередь
    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    //Извлечь символ из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

}
