package edu.gatech.cs2340

import java.util.Random

class Stock {
    internal var stock1 = 10
        private set
    val stock2 = 100
    val stock3 = 1000
    val stock4 = 10000
    val stock5 = 100000

    var stockOwned1 = 0
    var stockOwned2 = 0
    var stockOwned3 = 0
    var stockOwned4 = 0
    var stockOwned5 = 0

    internal fun updateStock() {
        val random = Random()
        stock1 += random.nextInt(6)
        stock1 -= random.nextInt(3)

        stock1 += random.nextInt(30)
        stock1 -= random.nextInt(15)

        stock1 += random.nextInt(80)
        stock1 -= random.nextInt(40)

        stock1 += random.nextInt(500)
        stock1 -= random.nextInt(250)

        stock1 += random.nextInt(1600)
        stock1 -= random.nextInt(600)
    }
}
