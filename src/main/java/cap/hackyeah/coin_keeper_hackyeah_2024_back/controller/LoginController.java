package cap.hackyeah.coin_keeper_hackyeah_2024_back.controller;

import java.io.IOException;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.service.LoginService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coinkeeper")
public class LoginController {

	@Autowired LoginService loginService;

	@GetMapping("/login")
	public ResponseEntity<String> logIn(@RequestParam String username,
			@RequestParam String password, HttpSession session) {
		if (loginService.logIn(username, password, session)){
			return ResponseEntity.status(HttpStatus.OK).body("Login successful.");
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized user.");
		}
	}

	@GetMapping("/logout")
	public ResponseEntity<String> logOut(HttpSession session) throws IOException {
		loginService.logOut(session);
		return ResponseEntity.status(HttpStatus.OK).body("User logged out.");
	}
}
