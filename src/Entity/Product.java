package Entity;

import java.util.Arrays;

public class Product {
    private String title;
    private Buyer[] buyers;

    public Product() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Buyer[] getBuyers() {
        return buyers;
    }

    public void setAuthors(Buyer[] buyers) {
        this.buyers = buyers;
    }

    public void addBuyer(Buyer buyer){
        Buyer[] newBuyer = Arrays.copyOf(buyers, buyers.length+1);
        newBuyer[newBuyer.length-1] = buyer;
        this.buyers = newBuyer;
    }

    @Override
    public String toString() {
        return "Product{"
                + "title=" + title
                + ", pokupateli=" + Arrays.toString(buyers)
                + '}';
    }

    public void setBuyers(Buyer[] createBuyers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}