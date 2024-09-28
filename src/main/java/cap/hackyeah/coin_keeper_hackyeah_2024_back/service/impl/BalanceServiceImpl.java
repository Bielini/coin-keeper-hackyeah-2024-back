package cap.hackyeah.coin_keeper_hackyeah_2024_back.service.impl;


import cap.hackyeah.coin_keeper_hackyeah_2024_back.dto.Player;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BalanceServiceImpl {

    @Autowired
    private PlayerRepository playerRepository;

    public  Long getBalance(Long userId){
        return playerRepository.findById(userId).get().getBalance();
    }

    public Long addMoney(long userId, long money){
        Player player = playerRepository.findById(userId).get();
        Long currentBalance = getBalance(userId);
        player.setBalance(currentBalance+money);
        return playerRepository.save(player).getBalance();
    }


    public Long deductMoney(long userId, long amount) {
        Player player = playerRepository.findById(userId).get();
        Long currentBalance = getBalance(userId);
        player.setBalance(currentBalance-amount);
        return playerRepository.save(player).getBalance();
    }
}
