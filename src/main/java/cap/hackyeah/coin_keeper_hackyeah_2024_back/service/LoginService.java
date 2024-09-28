package cap.hackyeah.coin_keeper_hackyeah_2024_back.service;

public interface LoginService {

	boolean signIn(String username, String password);

	boolean signOut();
}
