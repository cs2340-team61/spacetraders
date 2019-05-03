package edu.gatech.cs2340

import java.io.Serializable
import java.util.Random

internal class RandomEvent : Serializable {
    fun encounterPirates(): Boolean {
        var value = false
        val random = Random()
        val answer = random.nextInt(10)
        if (answer != 5) {
            value = true
        }
        return value

    }

    fun encounterPolice(): Boolean {
        var value = false
        val random = Random()
        val answer = random.nextInt(10)
        if (answer == 5) {
            value = true
        }
        return value
    }

    fun encounterTraders(): Boolean {
        var value = false
        val random = Random()
        val answer = random.nextInt(10)
        if (answer == 5) {
            value = true
        }
        return value
    }
}
