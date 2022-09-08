package model;

public class Meals {
    private String name;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Meals(String name, String price) {
        this.name = name;
        this.price = price;
    }
    public Meals(){

    }

    @Override
    public String toString() {
        return "Meals{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
