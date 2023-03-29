import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artwork artwork1;
    Artwork artwork2;
    Artwork artwork3;
    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Khalid");
        gallery = new Gallery("Louvre");
        artwork1 = new Artwork("Mona Lisa", artist, 5000, "boredApe");
        artwork2 = new Artwork("The Scream", artist, 3000, "finiki");
        artwork3 = new Artwork("The Last Supper", artist, 4000, "bounty");
        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);
        gallery.addArtwork(artwork3);
    }

    @Test
    public void canGetGalleryName(){
        assertThat(gallery.getGalleryName()).isEqualTo("Louvre");
    }

    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canGetArtwork(){
        assertThat(gallery.getArtwork().size()).isEqualTo(gallery.getArtworkCount());
    }

    @Test
    public void canAddArtwork(){
        Artwork artwork4 = new Artwork("Las Meninas", artist, 1000, "snickers");
        gallery.addArtwork(artwork4);
        assertThat(gallery.getArtworkCount()).isEqualTo(4);
    }

    @Test
    public void correctStockValue(){
        assertThat(gallery.stock_take(gallery)).isEqualTo(12000);
    }

}
