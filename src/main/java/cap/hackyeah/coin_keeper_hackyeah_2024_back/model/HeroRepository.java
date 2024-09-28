package cap.hackyeah.coin_keeper_hackyeah_2024_back.model;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.model.hero.Hero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends CrudRepository<Hero, Integer> {
}
