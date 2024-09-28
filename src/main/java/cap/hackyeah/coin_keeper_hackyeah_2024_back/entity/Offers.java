package cap.hackyeah.coin_keeper_hackyeah_2024_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Offers {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private String category;
    private Long offer;
    private Long price;

    protected Offers() {}
    public Offers(String title, String category, Long offer, Long price) {
        this.title = title;
        this.category = category;
        this.offer = offer;
        this.price = price;
    }


}
