package com.company.players;

import com.company.AbilityType;
import com.company.boss.Boss;
import com.company.players.Hero;



public class Doctor extends Hero {

    public Doctor (int health, int hit) {
        super (health, hit, AbilityType.HEAL);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (Hero hero: heroes) {
            hero.setHealth(hero.getHealth()+20);
        }
    }
}
