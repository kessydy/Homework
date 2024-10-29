package by.it_academy.homework10;

public class Item {
    private Category category;
    private String name;

    public Item(Category category, String name) {
        this.category = category;
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "category: " + category +
                ", name: " + name;
    }
}
