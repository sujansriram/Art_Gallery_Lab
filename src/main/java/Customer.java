import java.util.ArrayList;

public class Customer {

    private String customerName;
    private double wallet;
    private ArrayList<Artwork> artCollection;

    public Customer(String name, double wallet){
        this.customerName = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<Artwork> getArtCollection(){
        return this.artCollection;
    }

    public void buyArtwork(Gallery gallery,Artwork artwork){
        this.wallet -= artwork.getPrice();
        gallery.till += artwork.getPrice();
        gallery.stock.remove(artwork);
        this.artCollection.add(artwork);
    }

}
