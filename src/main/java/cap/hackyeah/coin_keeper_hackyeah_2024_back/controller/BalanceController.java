package cap.hackyeah.coin_keeper_hackyeah_2024_back.controller;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.service.impl.BalanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BalanceController {

    @Autowired
    BalanceServiceImpl balanceService;

    @GetMapping("/myBalance/{id}")
    public Long getBalance(@PathVariable long id) {
        return balanceService.getBalance(id);
    }

    @PutMapping("addMoney/{id}/{amount}")
    public Long addMoney(@PathVariable long id, @PathVariable long amount) {
        return balanceService.addMoney(id, amount);
    }

    @PutMapping("addExpense/{id}/{amount}")
    public Long addExpense(@PathVariable long id, long amount) {
        return balanceService.deductMoney(id, amount);
    }

}
