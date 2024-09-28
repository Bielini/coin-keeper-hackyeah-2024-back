package cap.hackyeah.coin_keeper_hackyeah_2024_back.service.impl;

import java.util.Optional;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.dto.Player;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.repository.LoginRepository;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired LoginRepository loginRepository;

	@Override public boolean logIn(String username, String password) {
		Optional<Player> playerFromDB = loginRepository.findByUsername(username);
		return playerFromDB
				.map(player ->
						player.getPassword().equals(password)
				)
				.orElse(false);
	}

	@Override public boolean logOut(boolean logOutButton) {
		// TODO: to kill session on log out
		return logOutButton;
	}
}
