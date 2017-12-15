package instruments;

public abstract class Instrument implements IPlay,ISell {
    String material;
    String colour;
    String type;
    double priceSell;
    double priceBuy;

    public Instrument(String material, String colour, String type, double priceSell, double priceBuy) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.priceSell = priceSell;
        this.priceBuy = priceBuy;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public double getPriceSell() {
        return priceSell;
    }

    public double getPriceBuy() {
        return priceBuy;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPriceSell(double priceSell) {
        this.priceSell = priceSell;
    }

    public void setPriceBuy(double priceBuy) {
        this.priceBuy = priceBuy;
    }

    @Override
    public double calculateMarkup() {
        return this.priceSell - priceBuy;
    }

    @Override
    public String play(String sound) {
        return "I make: " + sound;
    }
}
