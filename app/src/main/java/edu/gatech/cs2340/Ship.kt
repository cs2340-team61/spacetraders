package edu.gatech.cs2340

internal enum class Ship private constructor() {
    Gnat;

    val shp: String

    init {
        this.shp = "Gnat"
    }
}
