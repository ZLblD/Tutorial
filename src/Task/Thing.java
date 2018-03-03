package Task;

public class Thing {
    String clothes;

    public Thing(String clothes) {
        this.clothes = clothes;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return
                "и у меня есть " + clothes + '\'' +
                '}';
    }
}
