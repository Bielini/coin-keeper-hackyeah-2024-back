package cap.hackyeah.coin_keeper_hackyeah_2024_back.model.service;

import cap.hackyeah.coin_keeper_hackyeah_2024_back.model.HeroRepository;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.model.MonsterRepository;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.model.hero.HeroAbility;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.model.monster.MonsterAbility;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.model.monster.Powerfull;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.model.monster.StrongMonster;
import cap.hackyeah.coin_keeper_hackyeah_2024_back.model.monster.WeakMonster;
import org.springframework.beans.factory.annotation.Autowired;

public class GameplayServiceImpl implements GameplayService{

    @Autowired
    private MonsterAbility monsterAbility;

    @Autowired
    private HeroAbility heroAbility;

    @Autowired
    private HeroRepository heroRepository;

    @Autowired
    private MonsterRepository monsterRepository;

    int hitPower, int attackSpeed, int equipmentStrength
    @Override
    public void fight(boolean start) {

        if(start){

            if (balance == 100){
//                new WeakMonster()
                if (monsterRepository.findByHealthPoints()
            }
            if (balance == 500){
                new StrongMonster()
            }
            if (balance == 1000){
                new Powerfull();
            }

        }
    }
}
