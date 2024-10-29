package by.it_academy.homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

//Программа для учета заказов в интернет-магазине:
//- создать класс Order, который содержит информацию о заказе (например номер заказа, список товаров
// (Item) и их стоимость) и методы для добавления товаров, удаления товаров, вычисления общей стоимости заказа;
//- программа должна позволять добавлять новые заказы, удалять заказы, а также вычислять общую сумму всех заказов;
//- также необходимо реализовать методы для добавления заказа, удаления заказа и вычисления общей суммы всех заказов

public class Order {
    private List<Product> products;
    private UUID numberOfOrder;
    private static int num = 0;

    public Order() {
        this.products = new ArrayList<>();
        this.numberOfOrder = UUID.randomUUID();
    }

    public void addItem(Product product) {
        products.add(product);
    }

    public void addItems(Product... products) {
        this.products.addAll(Arrays.asList(products));
    }

    public void removeItem(Product product) {
        products.remove(product);
    }

    double getTotalCost() {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.getCost();
        }
        return totalCost;
    }

    public void getTotalCostOfOrder() {
        System.out.printf("The total cost of order is: %.2f dollar USA %n", getTotalCost());
    }

    public UUID getNumberOfOrder() {
        return numberOfOrder;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order: numberOfOrder: " + numberOfOrder +
                ", products: " + products;
    }
}
