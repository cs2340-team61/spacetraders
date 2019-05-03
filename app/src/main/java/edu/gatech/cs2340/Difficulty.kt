package edu.gatech.cs2340

/**
 * enum holding game difficulty values
 */
enum class Difficulty constructor(val diff: String) {
    Beginner("Beginner"),
    Easy("Easy"),
    Normal("Normal"),
    Hard("Hard"),
    Impossible("Impossible")
}
