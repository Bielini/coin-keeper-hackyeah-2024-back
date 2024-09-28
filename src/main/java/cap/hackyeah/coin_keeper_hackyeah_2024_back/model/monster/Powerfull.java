package cap.hackyeah.coin_keeper_hackyeah_2024_back.model.monster;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Powerfull implements MonsterAbility {


//    monster:  health:    weak: 1000    strong: 2000    powerful: 3000
    @Value("${monster.health.powerful}")
    private Integer healthCount;

    @Override
    public String damageHealth(int hitDamage) {

        Monster weakMonster = new Monster();
        Integer result = healthCount - hitDamage;
        weakMonster.setDamagePower(hitDamage);

        if (result <= 0){
            return "You win";
        }else {
            return "You lose and we recommend more save money to buy better equiment for you hero";
        }

    }

    @Override
    public Integer damagePower(int damage) {
        return null;
    }
}
