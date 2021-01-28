package no.dnb.bibeliotek;

public class Product {

private String description;
private String category;
private int netPrice;
private int unitsInStock;
private int stockReorderThreshold;

public Product(String d, String c, int n, int u, int s) {
    System.out.println("Product constructor called!");
    description = d;
    category = c;
    netPrice = n;
    unitsInStock = u;
    stockReorderThreshold = s;
}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void getSalesTax() {

    }

    public void getGrossPrice() {

    }

    public void checkStockLevelAndMaybeReorder() {

    }


    public boolean isAvailable() {
    if (unitsInStock > 0) {
        unitsInStock--;
        return true;
    }
    else {
        return false;
    }
    }



}
