package cap.hackyeah.coin_keeper_hackyeah_2024_back.service.impl;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.entity.Player;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.service.AlertService;
import org.springframework.stereotype.Service;

@Service
public class BillPaymentAlertService implements AlertService {

    @Override
    public void sendAlert(Player player, String text) {
        System.out.println("AlertService Triggered");
    }
}
