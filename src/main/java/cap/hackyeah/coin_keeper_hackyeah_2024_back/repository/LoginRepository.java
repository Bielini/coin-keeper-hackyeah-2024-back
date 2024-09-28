package cap.hackyeah.coin_keeper_hackyeah_2024_back.repository;

import java.util.Optional;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<Player, Long> {
	Optional<Player> findByUsername(String username);
}
