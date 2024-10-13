package by.it_academy.homework8.money;

public class Main {
    public static void main(String[] args) {
//    Класс Деньги для работы с денежными суммами. Число должно быть представлено двумя полями типа int
//    для рублей и копеек. Дробная часть (копейки) при выводе на экран должна быть отделена от целой части
//    запятой. Реализовать сложение, вычитание и операции сравнения. В функции main проверить эти методы.
//    * учесть кол-во рублей и копеек при выводе на экран : рубля/рублей копейки/копеек

        Money money = new Money(24, 26);
        Money money1 = new Money(14, 57);
        Money money2 = new Money(33, 90);
        Money money3 = new Money(10, 59);
        Money money4 = new Money(14, 57);
        money.printResult();
        money1.printResult();
        money.addMoney(money1);
        money.printResult();
        money.subtractMoney(money2);
        money.printResult();
        money.subtractMoney(money3);
        money.printResult();
        money1.compareMoney(money2);
        money1.compareMoney(money4);

    }
}
