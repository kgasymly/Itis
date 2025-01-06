package rutis.transport.list2;

public class Apple implements CanCompare{
    private String color;
    private int weight;
    private String kind;
    private int price;

    public Apple(String color, int weight, String kind, int price) {
        this.color = color;
        this.weight = weight;
        this.kind = kind;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compare(CanCompare obj){
        Apple apple = (Apple) obj;
        if (this.weight == apple.weight){
            return 0;
        }else if (this.weight > apple.weight){
            return 1;
        }return -1;
    }

    @Override
    public String toString() {
        return color + " " + weight + " " + kind + " " + price;
    }
}
