package cap.hackyeah.coin_keeper_hackyeah_2024_back.repository;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.dto.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Player, Long> {
}
