package by.it_academy.homework8.money;

public class Money {
//    Класс Деньги для работы с денежными суммами. Число должно быть представлено двумя полями типа int
//    для рублей и копеек. Дробная часть (копейки) при выводе на экран должна быть отделена от целой части
//    запятой. Реализовать сложение, вычитание и операции сравнения. В функции main проверить эти методы.
//    * учесть кол-во рублей и копеек при выводе на экран : рубля/рублей копейки/копеек
    private int ruble;
    private int kopeck;

    private String kopeckCase;

    public Money(int ruble, int kopeck) {
        this.ruble = ruble;
        this.kopeck = kopeck;
    }

    public int getRuble() {
        return ruble;
    }

    public int getKopeck() {
        return kopeck;
    }

    public void addMoney(Money money) {
        this.ruble = this.ruble + money.getRuble();
        this.kopeck = this.kopeck + money.getKopeck();
        if (this.kopeck > 100) {
            this.ruble += this.kopeck / 100;
            this.kopeck = this.kopeck % 100;
        }
    }

    public void subtractMoney(Money money) {
        this.ruble = this.ruble - money.getRuble();
        if (this.kopeck < money.getKopeck()) {
            this.ruble -= 1;
            this.kopeck = this.kopeck + 100 - money.getKopeck();
        } else {
            this.kopeck = this.kopeck - money.getKopeck();
        }
        if (this.ruble < 0) {
            this.ruble = 0;
            this.kopeck = 0;
        }
    }

    public void compareMoney(Money money) {
        if ((this.ruble * 100 + this.kopeck > money.getRuble() * 100 + money.getKopeck())){
            System.out.println("Исходная сумма больше");
        } else if ((this.ruble * 100 + this.kopeck == money.getRuble() * 100 + money.getKopeck())) {
            System.out.println("Суммы равны");
        } else {
            System.out.println("Исходная сумма меньше");
        }
    }


    private String printRuble() {
        if ((ruble % 10 >= 5) || (ruble % 10 == 0) || (((ruble / 10) % 10 == 1))) {
            return " рублей, ";
        } else if (ruble % 10 == 1) {
            return " рубль, ";
        } else {
            return " рубля, ";
        }
    }

    private String printKopeck() {
        if ((kopeck % 10 >= 5) || (kopeck % 10 == 0) || (((kopeck / 10) % 10 == 1))) {
            return " копеек.";
        } else if (kopeck % 10 == 1) {
            return " копейка.";
        } else {
            return " копейки.";
        }
    }

    public String displayMoney() {
        return "В кошельке " + ruble + "," + kopeck + ". " + ruble + printRuble() + kopeck + printKopeck();
    }

}
