package Test_;

class Screwdriver {
    String name;
    int weight;
    String color;
    String type;

    public Screwdriver(String name, int weight, String color, String type) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.type = type;
    }

    public Screwdriver(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void getInfo() {
        System.out.println("Инструмент " + name + " , его вес= " + weight + " цвет ручки " + color
                + " тип головки " + type);
    }

    @Override
    public String toString() {
        return "Screwdriver{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
