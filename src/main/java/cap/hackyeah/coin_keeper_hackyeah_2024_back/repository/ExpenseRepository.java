package cap.hackyeah.coin_keeper_hackyeah_2024_back.repository;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.model.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {
}
