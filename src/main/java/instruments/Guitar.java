package instruments;



public class Guitar extends Instrument {
    int numberofStrings;

    public Guitar(int numberofStrings, String material, String colour, String type, double priceSell, double priceBuy) {
        super(material, colour, type, priceSell, priceBuy);
        this.numberofStrings = numberofStrings;
    }


    public int getNumberofStrings() {
        return numberofStrings;
    }
}
