package edu.gatech.cs2340

import java.io.Serializable

internal class ShipStats : Serializable {
    var health: Int = 0
    var fuel: Int = 0
        private set
    var speed: Int = 0
        private set
    var laser: Int = 0
        private set

    init {
        health = 100
        fuel = 100
        speed = initialSpeed
        laser = initialLaser
    }

    fun useFuel(used: Double) {
        fuel -= used.toInt()
    }

    fun refillFuel() {
        fuel = 100
    }

    fun fixShip() {
        health = 100
    }

    fun upgradeSpeed() {
        speed += 10
    }

    fun upgradeLaser() {
        laser += 10
    }

    fun upgradeHealth() {}

    companion object {
        private val initialSpeed = 50
        private val initialLaser = 50
    }

}
