import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    @BeforeEach
    public void steUp(){
        artist = new Artist("Khalid");
    }

    @Test
    public void canGetArtistName(){
        assertThat(artist.getName()).isEqualTo("Khalid");
    }

}
