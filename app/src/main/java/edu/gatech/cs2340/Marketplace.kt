package edu.gatech.cs2340

import java.io.Serializable
import java.util.Random

internal class Marketplace : Serializable {
    private var mtlp: Int = 0
    private var basePrice: Int = 0
    private var ipl: Int = 0
    private var Var: Int = 0
    var level: Int = 0
        private set

    private fun getVar(): Int {
        return this.Var
    }

    fun techLevel(string: String?) {
        level = -1
        if ("Pre-Agriculture" == string) {
            level = 0
        }
        if ("Agriculture" == string) {
            level = 1
        }
        if ("Medieval" == string) {
            level = 2
        }
        if ("Renaissance" == string) {
            level = 3
        }
        if ("Early Industrial" == string) {
            level = 4
        }
        if ("Industrial" == string) {
            level = 5
        }
        if ("Post-Industrial" == string) {
            level = 6
        }
        if ("Hi-Tech" == string) {
            level = 7
        }

    }

    fun Water() {
        mtlp = 0
        basePrice = waterP
        ipl = waterIPL
        Var = 4
    }

    fun Furs() {
        mtlp = 0
        basePrice = fursP
        ipl = fursIPL
        Var = 10
    }

    fun Food() {
        mtlp = 1
        basePrice = foodP
        ipl = foodIPL
        Var = 5
    }

    fun Ore() {
        mtlp = 2
        basePrice = oreP
        ipl = oreIPL
        Var = 10
    }

    fun Games() {
        mtlp = 3
        basePrice = gamesP
        ipl = gamesIPL
        Var = 5
    }

    fun Firearms() {
        mtlp = 3
        basePrice = firearmsP
        ipl = firearmsIPL
        Var = 100
    }

    fun Medicine() {
        mtlp = 4
        basePrice = medicinesP
        ipl = medicinesIPL
        Var = 10
    }

    fun Machines() {
        mtlp = 4
        basePrice = machinesP
        ipl = machinesIPL
        Var = 5
    }

    fun Narcotics() {
        mtlp = 5
        basePrice = narcoticsP
        ipl = narcoticsIPL
        Var = `var`
    }

    fun Robots() {
        mtlp = 6
        basePrice = robotsP
        ipl = robotsIPL
        Var = 100
    }

    fun calculatePrice(): Int {
        val rand = Random()
        val buffer = rand.nextInt(getVar()) + 1
        return basePrice + ipl * (level - mtlp) + buffer
    }

    companion object {
        private val waterP = 30
        private val fursP = 250
        private val foodP = 100
        private val oreP = 350
        private val gamesP = 250
        private val firearmsP = 1250
        private val machinesP = 900
        private val medicinesP = 650
        private val narcoticsP = 1500
        private val robotsP = 3000

        private val waterIPL = 3
        private val fursIPL = 25
        private val foodIPL = 10
        private val oreIPL = 35
        private val gamesIPL = -25
        private val firearmsIPL = -125
        private val machinesIPL = -90
        private val medicinesIPL = -65
        private val narcoticsIPL = -150
        private val robotsIPL = -300
        private val `var` = 150
    }
}

