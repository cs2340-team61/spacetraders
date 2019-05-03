package edu.gatech.cs2340;

import java.util.Random;

public class Stock {
    private int stock1 = 10;
    private int stock2 = 100;
    private int stock3 = 1000;
    private int stock4 = 10000;
    private int stock5 = 100000;

    private int stockOwned1 = 0;
    private int stockOwned2 = 0;
    private int stockOwned3 = 0;
    private int stockOwned4 = 0;
    private int stockOwned5 = 0;

    void updateStock() {
        Random random = new Random();
        stock1 += random.nextInt(6);
        stock1 -= random.nextInt(3);

        stock1 += random.nextInt(30);
        stock1 -= random.nextInt(15);

        stock1 += random.nextInt(80);
        stock1 -= random.nextInt(40);

        stock1 += random.nextInt(500);
        stock1 -= random.nextInt(250);

        stock1 += random.nextInt(1600);
        stock1 -= random.nextInt(600);
    }

    int getStock1() {
        return stock1;
    }

    public int getStock2() {
        return stock2;
    }

    public int getStock3() {
        return stock3;
    }

    public int getStock4() {
        return stock4;
    }

    public int getStock5() {
        return stock5;
    }

    public int getStockOwned1() {
        return stockOwned1;
    }

    public int getStockOwned2() {
        return stockOwned2;
    }

    public int getStockOwned3() {
        return stockOwned3;
    }

    public int getStockOwned4() {
        return stockOwned4;
    }

    public int getStockOwned5() {
        return stockOwned5;
    }

    public void setStockOwned1(int stockOwned1) {
        this.stockOwned1 = stockOwned1;
    }

    public void setStockOwned2(int stockOwned2) {
        this.stockOwned2 = stockOwned2;
    }

    public void setStockOwned3(int stockOwned3) {
        this.stockOwned3 = stockOwned3;
    }

    public void setStockOwned4(int stockOwned4) {
        this.stockOwned4 = stockOwned4;
    }

    public void setStockOwned5(int stockOwned5) {
        this.stockOwned5 = stockOwned5;
    }
}
