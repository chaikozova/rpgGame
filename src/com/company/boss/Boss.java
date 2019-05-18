package com.company.boss;

import com.company.GameProcess;

import java.util.Random;

public class Boss extends GameProcess {

    public Boss (int health, int hit) {
        super (health, hit);
    }

    @Override
    public int getHit() {
        Random random = new Random();
        int randomInt = random.nextInt(3)+1;
        return this.hit * randomInt;
    }
}
