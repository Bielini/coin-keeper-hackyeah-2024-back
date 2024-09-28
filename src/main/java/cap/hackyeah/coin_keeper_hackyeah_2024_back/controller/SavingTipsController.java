package cap.hackyeah.coin_keeper_hackyeah_2024_back.controller;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.model.SavingTips;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SavingTipsController {

    private SavingTips tips = new SavingTips();

    @GetMapping("/tip")
    String getTip(){
        return tips.getRandomTip();
    }
}
