package cap.hackyeah.coin_keeper_hackyeah_2024_back.model;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.model.monster.Monster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonsterRepository extends CrudRepository<Monster, Integer> {
    List<Monster> findByHealthPoints();
}
