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
        Product product1 = new Product(Item.BOOK, 12.5);
        Product product2 = new Product(Item.DOLL, 14.6);
        Product product3 = new Product(Item.PUZZLE, 5.6);
        Product product4 = new Product(Item.TRAIN, 55.3);
        Product product5 = new Product(Item.CONSTRUCTOR, 20);
        Product product6 = new Product(Item.CAR, 18.5);
        Product product7 = new Product(Item.WEAPON, 30);
        Product product8 = new Product(Item.TRAIN, 55.3);
        Product product9 = new Product(Item.TRAIN, 55.3);
        Product product10 = new Product(Item.DOLL, 14.6);
        Product product11 = new Product(Item.TRAIN, 55.3);
        Product product12 = new Product(Item.BOOK, 12.5);
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
