package cap.hackyeah.coin_keeper_hackyeah_2024_back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    public String getBalance(){
        return "The current balance";
    }
}
