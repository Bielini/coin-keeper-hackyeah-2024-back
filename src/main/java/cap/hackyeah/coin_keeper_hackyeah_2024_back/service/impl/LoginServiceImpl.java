package cap.hackyeah.coin_keeper_hackyeah_2024_back.service.impl;

import java.io.IOException;
import java.util.Optional;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.dto.Player;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.repository.LoginRepository;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.service.LoginService;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.Manager;
import org.apache.catalina.Session;
import org.apache.catalina.session.StandardManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired LoginRepository loginRepository;

	@Override public boolean logIn(String username, String password, HttpSession session) {
		Optional<Player> playerFromDB = loginRepository.findByUsername(username);
		session.setAttribute("playerUsername", username);
		return playerFromDB
				.map(player ->
						player.getPassword().equals(password)
				)
				.orElse(false);
	}

	@Override public void logOut(HttpSession session) {
		session.invalidate();
	}
}
