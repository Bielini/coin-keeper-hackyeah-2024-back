package cap.hackyeah.coin_keeper_hackyeah_2024_back.controller;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.dto.Player;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.service.impl.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    RegisterServiceImpl registerService;

    @PostMapping("/register")
    public Player register(@RequestBody Player player) {
        return registerService.registerUser(player);
    }

}
