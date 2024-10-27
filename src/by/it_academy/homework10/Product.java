package by.it_academy.homework10;

public class Product {
    private Item item;
    private double cost;

    public Product(Item item, double cost) {
        this.item = item;
        this.cost = cost;
    }

    public Item getItem() {
        return item;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Item: " + item +
                ", cost: " + cost;
    }
}
