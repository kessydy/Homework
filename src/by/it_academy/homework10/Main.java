package by.it_academy.homework10;

//Программа для учета заказов в интернет-магазине:
//- создать класс Order, который содержит информацию о заказе (например номер заказа, список товаров
// (Item) и их стоимость) и методы для добавления товаров, удаления товаров, вычисления общей стоимости заказа;
//- программа должна позволять добавлять новые заказы, удалять заказы, а также вычислять общую сумму всех заказов;
//- также необходимо реализовать методы для добавления заказа,
// удаления заказа и вычисления общей суммы всех заказов
public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Order order1 = new Order();
        Item item1 = new Item(Category.BOOK, "Alice in Wonderland");
        Item item2 = new Item(Category.TOY, "Doll");
        Item item3 = new Item(Category.TOY, "Puzzle");
        Item item4 = new Item(Category.TOY, "Train");
        Item item5 = new Item(Category.TOY, "Constructor");
        Item item6 = new Item(Category.TOY, "Car");
        Item item7 = new Item(Category.TOY, "Weapon");
        Item item8 = new Item(Category.STATIONERY, "Pen");

        Product product1 = new Product(item1, 12.5);
        Product product2 = new Product(item2, 14.6);
        Product product3 = new Product(item3, 5.6);
        Product product4 = new Product(item4, 55.3);
        Product product5 = new Product(item5, 20);
        Product product6 = new Product(item6, 18.5);
        Product product7 = new Product(item7, 30);
        Product product8 = new Product(item4, 55.3);
        Product product9 = new Product(item4, 55.3);
        Product product10 = new Product(item2, 14.6);
        Product product11 = new Product(item8, 2.3);
        Product product12 = new Product(item1, 12.5);
        order1.addItems(product1, product2, product3, product4);
        System.out.println(order1);
        order1.addItem(product5);
        order1.removeItem(product3);
        System.out.println(order1);
        order1.getTotalCostOfOrder();

        Order order2 = new Order();
        order2.addItems(product6, product7, product8, product9, product10);

        Order order3 = new Order();
        order3.addItems(product11, product12);

        cart.addOrder(order1);
        cart.addOrder(order2);
        cart.removeOrder(order1);
        cart.addOrder(order3);
        System.out.println(cart);
        cart.getTotalCostOfCart();
    }
}
