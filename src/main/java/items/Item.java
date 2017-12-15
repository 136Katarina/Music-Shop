package items;

import instruments.ISell;

public abstract class Item implements ISell {

    double priceBuy;
    double addPercentage;

    public Item(double priceBuy, double addPercentage) {
        this.priceBuy = priceBuy;
        this.addPercentage = addPercentage;
    }

    public double getPriceBuy() {
        return priceBuy;
    }

    public void setPriceBuy(double priceBuy) {
        this.priceBuy = priceBuy;
    }

    public double getAddPercentage() {
        return addPercentage;
    }

    @Override
    public double calculateMarkup() {
        return this.priceBuy + (priceBuy  * addPercentage);
    }
}
