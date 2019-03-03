package edu.gatech.cs2340;

public class Marketplace {
    private int MTLP;

    private int MTLU;

    private int TTP;

    private int BasePrice;

    private int IPL;

    private int Var;

    private String IE;

    private String CR;

    private String ER;

    private int MTL;

    private int MTH;

    private int getMTLP() { return this.MTLP; }

    private int getMTLU() { return this.MTLU;}

    private int getTTP() { return this.TTP;}

    private int getBasePrice() { return this.BasePrice;}

    private int getIPL() { return this.IPL;}

    private int getVar() { return this.Var;}

    private String getIE() { return this.IE;}

    private String getCR() { return this.CR;}

    private String getER() { return this.ER;}

    private int getMTL() { return this.MTL;}

    private int getMTH() { return this.MTH;}

    private int techLevel() {
        int level = 0;
        Planet planet = new Planet(12, 16);
        String string = planet.getTechLevel();
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
            return level = 7;
        }
        return level;
    }

    public void Water() {
        MTLP = 0;
        MTLU = 0;
        TTP = 2;
        BasePrice = 30;
        IPL = 3;
        Var = 4;
        IE = "DROUGHT";
        CR = "LOTSOFWATER";
        ER = "DESERT";
        MTL = 30;
        MTH = 50;
    }

    public void Furs() {
        MTLP = 0;
        MTLU = 0;
        TTP = 0;
        BasePrice = 250;
        IPL = 10;
        Var = 10;
        IE = "COLD";
        CR = "RICHFAUNA";
        ER = "LIFELESS";
        MTL = 230;
        MTH = 280;
    }

    public void Food() {
        MTLP = 1;
        MTLU = 0;
        TTP = 1;
        BasePrice = 100;
        IPL = 5;
        Var = 5;
        IE = "CROPFAIL";
        CR = "RICHSOIL";
        ER = "POORSOIL";
        MTL = 90;
        MTH = 160;
    }

    public void Ore() {
        MTLP = 2;
        MTLU = 2;
        TTP = 3;
        BasePrice = 350;
        IPL = 20;
        Var = 10;
        IE = "WAR";
        CR = "MINERALRICH";
        ER = "MINERALPOOR";
        MTL = 350;
        MTH = 420;
    }

    public void Games() {
        MTLP = 3;
        MTLU = 1;
        TTP = 6;
        BasePrice = 250;
        IPL = -10;
        Var = 5;
        IE = "BOREDOM";
        CR = "ARTISTIC";
        ER = null;
        MTL = 160;
        MTH = 270;
    }

    public void Firearms() {
        MTLP = 3;
        MTLU = 1;
        TTP = 5;
        BasePrice = 1250;
        IPL = -75;
        Var = 100;
        IE = "WAR";
        CR = "WARLIKE";
        ER = null;
        MTL = 600;
        MTH = 1100;
    }

    public void Medicine() {
        MTLP = 4;
        MTLU = 1;
        TTP = 6;
        BasePrice = 650;
        IPL = -20;
        Var = 10;
        IE = "PLAGUE";
        CR = "LOTSOFHERBS";
        ER = null;
        MTL = 400;
        MTH = 700;
    }

    public void Machines() {
        MTLP = 4;
        MTLU = 3;
        TTP = 5;
        BasePrice = 900;
        IPL = -30;
        Var = 5;
        IE = "LACKOFWORKERS";
        CR = null;
        ER = null;
        MTL = 600;
        MTH = 800;
    }

    public void Narcotics() {
        MTLP = 5;
        MTLU = 0;
        TTP = 5;
        BasePrice = 3500;
        IPL = -125;
        Var = 150;
        IE = "BOREDOM";
        CR = "WEIRDMUSHROOMS";
        ER = null;
        MTL = 2000;
        MTH = 3000;
    }

    public void Robots() {
        MTLP = 6;
        MTLU = 4;
        TTP = 7;
        BasePrice = 5000;
        IPL = -150;
        Var = 100;
        IE = "LACKOFWORKERS";
        CR = null;
        ER = null;
        MTL = 3500;
        MTH = 5000;
    }
}

