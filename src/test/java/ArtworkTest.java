import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artist artist;
    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Khalid");
        artwork = new Artwork("MonaLisa", artist, 5000, "boredApe");
    }

    @Test
    public void hasTitle(){
        assertThat(artwork.getTitle()).isEqualTo("MonaLisa");
    }

    @Test
    public void canGetPrice(){
        assertThat(artwork.getPrice()).isEqualTo(5000);
    }

    @Test
    public void canGetNFT(){
        assertThat(artwork.getNft()).isEqualTo("boredApe");
    }

    @Test
    public void canFindArtistName(){
        assertThat(artwork.getArtistName(artist)).isEqualTo("Khalid");
    }

}
