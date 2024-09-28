package cap.hackyeah.coin_keeper_hackyeah_2024_back.repository;

import java.util.Optional;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.dto.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<Users, Long> {
	Optional<Users> findByUsername(String username);
}
