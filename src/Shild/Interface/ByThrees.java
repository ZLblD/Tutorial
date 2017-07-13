package Shild.Interface;

/**
 * Следует также иметь в виду, что если в определении класса имеется ключевое слово
 implements, но он не реализует все методы указанного интерфейса, то этот класс должен
 быть объявлен абстрактным (abstract). Объект такого класса создать нельзя, но
 ero можно использовать в качестве суперкласса, а завершить реализацию методов интерфейса
 в ero подклассах.
 */
public class ByThrees implements Series {       //Другой способ реализации интерфейса Series
    int start;
    int val;

    ByThrees() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
