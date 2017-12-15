package items;

public class Book extends Item {
    String name;

    public Book(double priceBuy, double addPercentage, String name) {
        super(priceBuy, addPercentage);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
