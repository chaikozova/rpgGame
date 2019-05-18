package com.company.players;

import com.company.AbilityType;
import com.company.boss.Boss;

public class Magical extends Hero {

    public Magical(int health, int hit) {
        super (health, hit, AbilityType.BOOST);
    }

    @Override
    public void useAbility (Hero[] heroes, Boss boss) {
        for (Hero hero: heroes) {
            hero.setHit(hero.getHit()+5);
        }
    }
}
