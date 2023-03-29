import java.util.ArrayList;

public class Gallery {

    private String galleryName;
    public double till;
    public ArrayList<Artwork> stock;

    public Gallery(String name){
        this.galleryName = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public String getGalleryName() {
        return this.galleryName;
    }

    public double getTill() {
        return this.till;
    }

    public ArrayList<Artwork> getArtwork() {
        return this.stock;
    }

    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
    }

    public int getArtworkCount(){
        return this.stock.size();
    }

    public int stock_take(Gallery gallery) {
        int totalOfArtwork = 0;
        for (Artwork artwork : gallery.getArtwork()) {
            totalOfArtwork += artwork.getPrice();
        }
        return totalOfArtwork;
    }

}
