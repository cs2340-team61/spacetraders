package edu.gatech.cs2340

class Bank {
    var bankCredits = 0
    private val interest = .05

    fun deposit(amount: Int) {
        bankCredits += amount
    }

    fun withdraw(amount: Int) {
        bankCredits -= amount
    }

    fun addInterest() {
        bankCredits += (bankCredits * interest).toInt()
    }

}
