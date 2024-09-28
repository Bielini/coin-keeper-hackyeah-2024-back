package cap.hackyeah.coin_keeper_hackyeah_2024_back.controller;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.model.Expense;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.StreamSupport;

@RestController
public class ExpenseController {

    @Autowired
    private ExpenseRepository repository;

    @PostMapping("/addExpense")
    void addExpense(@RequestBody Expense expense) {
        repository.save(expense);
        System.out.println(expense);
    }

    @GetMapping("/moneySpent")
    double getMoneySpend() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .mapToDouble(Expense::getAmount)
                .sum();
    }
}