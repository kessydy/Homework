package by.it_academy.homework10;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List <Order> orders;

    public Cart() {
        this.orders = new ArrayList<>();
    }

    public void addOrder (Order order){
        orders.add(order);
    }

    public void removeOrder (Order order){
        orders.remove(order);
    }

    private double getTotalCost(){
        double totalCost = 0;
        for (Order order : orders) {
            totalCost += order.getTotalCost();
        }return totalCost;
    }

    public void getTotalCostOfCart(){
        System.out.printf("The total cost of cart is: %.2f dollar USA %n", getTotalCost());
    }

    @Override
    public String toString() {
        return "Basket: " + orders;
    }
}
