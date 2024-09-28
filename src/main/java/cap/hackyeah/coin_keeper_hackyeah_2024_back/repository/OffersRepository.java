package cap.hackyeah.coin_keeper_hackyeah_2024_back.repository;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.dto.Offers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffersRepository extends CrudRepository<Offers, Long> {
}
