package cap.hackyeah.coin_keeper_hackyeah_2024_back.service.impl;

import java.util.Optional;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.dto.Users;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.repository.LoginRepository;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired LoginRepository loginRepository;

	@Override public boolean signIn(String username, String password) {
		Optional<Users> user = loginRepository.findByUsername(username);
		return user
				.map(users ->
						users.getPassword().equals(password)
				)
				.orElse(false);
	}

	@Override public boolean signOut() {
		return false;
	}
}
