package com.company;

import com.company.players.Hero;
import com.company.boss.Boss;

public interface Ability {
    void useAbility(Hero heroes[], Boss boss);
}
