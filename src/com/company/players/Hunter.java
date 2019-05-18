package com.company.players;

import com.company.AbilityType;
import com.company.boss.Boss;
import java.util.Random;
import com.company.players.Hero;

public class Hunter extends Hero {

    public Hunter (int health, int hit) {
        super(health, hit, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public int getHit() {
        Random random = new Random();
        int randomInt = random.nextInt(6)+1;
        return this.hit*randomInt;
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

    }
}
