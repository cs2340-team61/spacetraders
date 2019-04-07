package edu.gatech.cs2340;

import java.io.Serializable;
import java.util.Random;

public class Marketplace implements Serializable {
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

    public void techLevel(String string) {
        level = -1;
        if (string.equals("Pre-Agriculture")) {
            level = 0;
        }
        if (string.equals("Agriculture")) {
            level = 1;
        }
        if (string.equals("Medieval")) {
            level = 2;
        }
        if (string.equals("Renaissance")) {
            level = 3;
        }
        if (string.equals("Early Industrial")) {
            level = 4;
        }
        if (string.equals("Industrial")) {
            level = 5;
        }
        if (string.equals("Post-Industrial")) {
            level = 6;
        }
        if (string.equals("Hi-Tech")) {
            level = 7;
        }

     }

    public void Water() {
        MTLP = 0;
        BasePrice = waterP;
        IPL = waterIPL;
        Var = 4;
    }

    public void Furs() {
        MTLP = 0;
        BasePrice = fursP;
        IPL = fursIPL;
        Var = 10;
    }

    public void Food() {
        MTLP = 1;
        BasePrice = foodP;
        IPL = foodIPL;
        Var = 5;
    }

    public void Ore() {
        MTLP = 2;
        BasePrice = oreP;
        IPL = oreIPL;
        Var = 10;
    }

    public void Games() {
        MTLP = 3;
        BasePrice = gamesP;
        IPL = gamesIPL;
        Var = 5;
    }

    public void Firearms() {
        MTLP = 3;
        BasePrice = firearmsP;
        IPL = firearmsIPL;
        Var = 100;
    }

    public void Medicine() {
        MTLP = 4;
        BasePrice = medicinesP;
        IPL = medicinesIPL;
        Var = 10;
    }

    public void Machines() {
        MTLP = 4;
        BasePrice = machinesP;
        IPL = machinesIPL;
        Var = 5;
    }

    public void Narcotics() {
        MTLP = 5;
        BasePrice = narcoticsP;
        IPL = narcoticsIPL;
        Var = var;
    }

    public void Robots() {
        MTLP = 6;
        BasePrice = robotsP;
        IPL = robotsIPL;
        Var = 100;
    }

    public int calculatePrice() {
        Random rand = new Random();
        int buffer = (rand.nextInt(getVar()) + 1);
        int price = getBasePrice() + (getIPL() * (level - getMTLP())) + (buffer);
        return price;
    }
}

