package com.company.players;

import com.company.Ability;
import com.company.AbilityType;
import com.company.GameProcess;

public abstract class Hero extends GameProcess implements Ability {

    protected AbilityType ability;

    public Hero(int health, int hit, AbilityType ability) {
        super(health, hit);
        this.ability = ability;
    }

    public AbilityType getAbility() {
        return ability;
    }

    public void setAbility(AbilityType ability) {
        this.ability = ability;
    }
}
