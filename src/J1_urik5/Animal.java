package J1_urik5;

/**
 * Created by ЗВЕРЬ-МАШИНА on 22.06.2017.
 */
public abstract class Animal {
    abstract void voice();  // полиморфизм
    final void sleep() {        // final - запрещает переопределять у потомков
        System.out.println("Sleep");
    }
}
