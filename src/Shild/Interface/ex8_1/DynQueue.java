package Shild.Interface.ex8_1;

/**
 * Created by TEHOTD7 on 19.07.2017.
 */
// Динамическа очередь
// растущая очередь
public class DynQueue implements ICharQ {
    private char q[];       //массив для хранения элемнтов очереди
    private int putloc;     //индекс вставляемых элементов
    private int getloc;     // индеrcs извлекаемых элементов

    // Создать пустую очередь заданного размера
    public DynQueue(int size) {
        q = new char[size + 1];   // выделить память для очереди
        putloc = getloc = 0;
    }

    // поместить символ в очередь
    @Override
    public void put(char ch) {
        if (putloc == q.length - 1) {
            // увеличить размер очереди
            char t[] = new char[q.length * 2];
            // скопировать элементы в новую очередь
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
                q = t;
            }
        putloc++;
        q[putloc] = ch;
        }
    }

    // извлечь символ из очереди
    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
