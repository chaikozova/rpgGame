package com.company;

public abstract class GameProcess {
    protected int health;
    protected int hit;

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHit() {
        return this.hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public GameProcess (int health, int hit) {
        this.health = health;
        this.hit = hit;
    }

    public int putDamage (int damage) {
        this.health = this.health - damage;
        return this.health;
    }
}
