package edu.gatech.cs2340;

import java.io.Serializable;
import java.util.Random;

class Marketplace implements Serializable {
    private int MTLP;
    private int BasePrice;
    private int IPL;
    private int Var;
    private int level;
    private static final int waterP = 30;
    private static final int fursP = 250;
    private static final int foodP = 100;
    private static final int oreP = 350;
    private static final int gamesP = 250;
    private static final int firearmsP = 1250;
    private static final int machinesP = 900;
    private static final int medicinesP = 650;
    private static final int narcoticsP = 1500;
    private static final int robotsP = 3000;

    private static final int waterIPL = 3;
    private static final int fursIPL = 25;
    private static final int foodIPL = 10;
    private static final int oreIPL = 35;
    private static final int gamesIPL = -25;
    private static final int firearmsIPL = -125;
    private static final int machinesIPL = -90;
    private static final int medicinesIPL = -65;
    private static final int narcoticsIPL = -150;
    private static final int robotsIPL = -300;
    private static final int var = 150;

    private int getMTLP() { return this.MTLP; }

    private int getBasePrice() { return this.BasePrice;}

    private int getIPL() { return this.IPL;}

    private int getVar() { return this.Var;}

    void techLevel(String string) {
        level = -1;
        if ("Pre-Agriculture".equals(string)) {
            level = 0;
        }
        if ("Agriculture".equals(string)) {
            level = 1;
        }
        if ("Medieval".equals(string)) {
            level = 2;
        }
        if ("Renaissance".equals(string)) {
            level = 3;
        }
        if ("Early Industrial".equals(string)) {
            level = 4;
        }
        if ("Industrial".equals(string)) {
            level = 5;
        }
        if ("Post-Industrial".equals(string)) {
            level = 6;
        }
        if ("Hi-Tech".equals(string)) {
            level = 7;
        }

     }

    int getLevel() {
        return level;
    }

    void Water() {
        MTLP = 0;
        BasePrice = waterP;
        IPL = waterIPL;
        Var = 4;
    }

    void Furs() {
        MTLP = 0;
        BasePrice = fursP;
        IPL = fursIPL;
        Var = 10;
    }

    void Food() {
        MTLP = 1;
        BasePrice = foodP;
        IPL = foodIPL;
        Var = 5;
    }

    void Ore() {
        MTLP = 2;
        BasePrice = oreP;
        IPL = oreIPL;
        Var = 10;
    }

    void Games() {
        MTLP = 3;
        BasePrice = gamesP;
        IPL = gamesIPL;
        Var = 5;
    }

    void Firearms() {
        MTLP = 3;
        BasePrice = firearmsP;
        IPL = firearmsIPL;
        Var = 100;
    }

    void Medicine() {
        MTLP = 4;
        BasePrice = medicinesP;
        IPL = medicinesIPL;
        Var = 10;
    }

    void Machines() {
        MTLP = 4;
        BasePrice = machinesP;
        IPL = machinesIPL;
        Var = 5;
    }

    void Narcotics() {
        MTLP = 5;
        BasePrice = narcoticsP;
        IPL = narcoticsIPL;
        Var = var;
    }

    void Robots() {
        MTLP = 6;
        BasePrice = robotsP;
        IPL = robotsIPL;
        Var = 100;
    }

    int calculatePrice() {
        Random rand = new Random();
        int buffer = (rand.nextInt(getVar()) + 1);
        return getBasePrice() + (getIPL() * (level - getMTLP())) + (buffer);
    }
}

