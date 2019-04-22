package edu.gatech.cs2340;

public class Bank {
    private int bankCredits = 0;
    private double interest = .05;

    void deposit(int amount) {
        bankCredits += amount;
    }

    void withdraw(int amount) {
        bankCredits -= amount;
    }

    void addInterest() {
        bankCredits += bankCredits * interest;
    }

    int getBankCredits() {
        return bankCredits;
    }

}
