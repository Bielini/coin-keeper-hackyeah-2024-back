package cap.hackyeah.coin_keeper_hackyeah_2024_back.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OffersController {

    @GetMapping("/offers")
    public  String getCurrentOffers(){
        return "The current offers list ";
    }
}
