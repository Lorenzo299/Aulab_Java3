public class Dish {
    private String name;
    private int price;

    public Dish(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void info() {
        System.out.println(name + " e il nome di questo piatto e costa " + price);
    }

}
