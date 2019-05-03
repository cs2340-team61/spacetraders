package edu.gatech.cs2340

import java.io.Serializable

internal class Travel : Serializable {

    fun calculateDist(x1: Int, x2: Int, y1: Int, y2: Int): Int {
        return if (x1 >= 0 && x1 <= upper && y1 >= 0 && y1 <= upper && x2 >= 0
                && x2 <= upper && y2 >= 0 && y2 <= upper) {
            Math.round(Math.sqrt(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)).toDouble()).toFloat())
        } else -1

    }

    fun calculateFuel(distance: Int): Int {
        return distance / 5
    }

    companion object {
        private val upper = 250
    }
}
