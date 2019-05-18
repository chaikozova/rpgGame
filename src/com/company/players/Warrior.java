package com.company.players;

import com.company.boss.Boss;
import com.company.AbilityType;

public class Warrior extends Hero {

    private int lastGetDamage;

    public Warrior (int health, int hit) {
        super (health, hit, AbilityType.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public int getHit() {
        return this.hit + lastGetDamage;
    }
    @Override
    public int putDamage (int damage) {
        this.lastGetDamage = damage;
        this.health = health -damage;
        return this.health;
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

    }
}
