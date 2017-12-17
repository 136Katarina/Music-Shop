package shops;

import instruments.ISell;

import java.util.ArrayList;

public class Shop {
    String name;
    ArrayList<ISell>stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public void add(ISell newInput){
        stock.add(newInput);
    }

    public int totalStock() {
        return stock.size();
    }

    public void clearStock(){
         this.stock.clear();
    }

    public void remove(int i) {
        this.stock.remove(i);
    }

    public double total(){
        double total = 0.0;
        for (ISell item : stock) {
            total += item.calculateMarkup();
        }
        return total;
    }





}
