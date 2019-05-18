package com.company;

import com.company.boss.Boss;
import com.company.players.Hero;
import com.company.players.Hunter;
import com.company.players.Magical;
import com.company.players.Warrior;
import com.company.players.Doctor;

public class RpgGame {

    public static void startGame() {
        Hero heros[] = getHeroesMassive();
        Boss boss = new Boss(700, 80);

        showStatistics(heros, boss);
        while (!isFinish(heros, boss)) {
            round(heros, boss);
        }
    }

    private static boolean isFinish(Hero heroes[], Boss boss) {

        if (boss.getHealth() <= 0) {
            System.out.println("Boss has lost!!!");
            System.out.println("Heroes have won!!!");
            return true;
        }

        boolean allHeroesWasDied = true;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                allHeroesWasDied = false;
            }
        }

        if (allHeroesWasDied) {
            System.out.println("Boss has won!!!");
            System.out.println("Heroes have lost!!!");
        }

        return allHeroesWasDied;
    }

    private static void round(Hero[] heroes, Boss boss) {
        bossBits (heroes, boss);

        if (isFinish(heroes,boss)) {
            showStatistics(heroes,boss);
            return;
        }

        heroesBit (heroes, boss);
        applyAbility(heroes, boss);
        showStatistics(heroes, boss);
    }

    private static void bossBits (Hero heroes [], Boss boss) {
        for (Hero hero : heroes) {
            int bossAttack = boss.getHit();
            if (bossAttack > hero.getHealth()) {
                hero.putDamage(hero.getHealth());
            }
            else
                hero.putDamage(bossAttack);
            System.out.println("Boss attack hero " + hero.getClass().getSimpleName().toString() + ": " + bossAttack);
        }
    }

    private static  void heroesBit (Hero heroes [], Boss boss) {
        for (Hero hero : heroes) {
            int heroAttack = hero.getHit();
            if (heroAttack > boss.getHealth()) {
                boss.putDamage(boss.getHealth());
            }
            else
                boss.putDamage(heroAttack);
            System.out.println("Hero " + hero.getClass().getSimpleName().toString() + " attack Boss: " + heroAttack);
        }
    }

    private static void applyAbility (Hero heroes [], Boss boss) {
        for (Hero hero : heroes) {
            hero.useAbility(heroes, boss);
        }
    }

    private static void showStatistics (Hero heroes [], Boss boss) {
        System.out.println("______________");
        for (Hero hero : heroes) {
            System.out.println("Hero " + hero.getClass().getSimpleName().toString() + " current health: " + hero.getHealth());
        }
            System.out.println("Boss current health: " + boss.getHealth());
            System.out.println("______________");
        }

    private static Hero[] getHeroesMassive() {
        Hero result[] = new Hero[4];
        result[0] = new Hunter (250,10);
        result[1] = new Magical(250,10);
        result[2] = new Warrior(250,10);
        result[3] = new Doctor(250,10);
        return result;
    }

}
