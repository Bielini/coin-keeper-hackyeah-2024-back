package cap.hackyeah.coin_keeper_hackyeah_2024_back.service.impl;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.dto.Player;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl {

    @Autowired
    private PlayerRepository playerRepository;

    public Player registerUser(Player player) {
        return playerRepository.save(player);
    }

}
