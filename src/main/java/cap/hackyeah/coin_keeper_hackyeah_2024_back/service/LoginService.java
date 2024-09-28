package cap.hackyeah.coin_keeper_hackyeah_2024_back.service;

import java.io.IOException;

import jakarta.servlet.http.HttpSession;

public interface LoginService {

	boolean logIn(String username, String password, HttpSession session);

	void logOut(HttpSession session) throws IOException;
}
