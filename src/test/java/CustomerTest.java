import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Artwork artwork1;
    Artwork artwork2;
    Artwork artwork3;
    Gallery gallery;
    Artist khalid;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Louvre");
        customer = new Customer("Sujan", 10000);
        khalid = new Artist("Khalid");
        artwork1 = new Artwork("Mona Lisa", khalid, 5000, "boredApe");
        artwork2 = new Artwork("The Scream", khalid, 3000, "finiki");
        artwork3 = new Artwork("The Last Supper", khalid, 4000, "bounty");
        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);
        gallery.addArtwork(artwork3);
    }

    @Test
    public void canGetCustomerName(){
        assertThat(customer.getCustomerName()).isEqualTo("Sujan");
    }

    @Test
    public void canGetWallet() {
        assertThat(customer.getWallet()).isEqualTo(10000);
    }

    @Test
    public void canBuyArtwork(){
        customer.buyArtwork(gallery, artwork1);
        assertThat(customer.getWallet()).isEqualTo(5000);
        assertThat(gallery.getTill()).isEqualTo(5000);
        assertThat(gallery.getArtworkCount()).isEqualTo(2);
        assertThat(customer.getArtCollection().size()).isEqualTo(1);
    }



}
