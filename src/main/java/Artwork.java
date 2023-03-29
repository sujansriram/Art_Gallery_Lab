public class Artwork {

    private String title;
    private String artistName;
    private Artist artist;
    private double price;
    private String nft;

    public Artwork(String title, Artist artist, double price, String nft){
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
        this.artistName = "";
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtistName(Artist artist) {
        return this.artistName = artist.getName();
    }

    public double getPrice() {
        return this.price;
    }

    public String getNft() {
        return this.nft;
    }

    public void setPrice(double value) {
        this.price = value;
    }

}
