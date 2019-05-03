package edu.gatech.cs2340

import java.io.Serializable

/**
 * Class to create the game
 */
class Game : Serializable {
    /**
     * Getter for game difficulty
     * @return universe returns the game difficulty
     */
    /**
     * Setter for game difficulty
     * @param diff game difficulty
     */
    var gameDiff: Difficulty? = null
    /**
     * Getter for Player
     * @return player
     */
    /**
     * Setter for player
     * @param player player variable
     */
    var player: Player? = null
    /**
     * Getter for Universe
     * @return universe
     */
    /**
     * Setter for Universe
     * @param universe universe variable
     */
    var universe: Universe? = null
    private val plans = arrayOfNulls<Planet>(totalPlanets)
    /**
     * Getter for Player's Location
     * @return player's location
     */
    /**
     * Setter for Player's Location
     * @param playerLocation Player's Location
     */
    var playerLocation: Planet? = null
    private var water: Marketplace? = null
    private var furs: Marketplace? = null
    private var food: Marketplace? = null
    private var ore: Marketplace? = null
    private var games: Marketplace? = null
    private var firearms: Marketplace? = null
    private var medicine: Marketplace? = null
    private var machines: Marketplace? = null
    private var narcotics: Marketplace? = null
    private var robots: Marketplace? = null
    /**
     * Getter for Water Price
     * @return waterPrice
     */
    var waterPrice: Int = 0
        private set
    /**
     * Getter for Fur Price
     * @return fursPrice
     */
    var fursPrice: Int = 0
        private set
    /**
     * Getter for Food Price
     * @return foodPrice
     */
    var foodPrice: Int = 0
        private set
    /**
     * Getter for Ore Price
     * @return orePrice
     */
    var orePrice: Int = 0
        private set
    /**
     * Getter for Game Price
     * @return gamesPrice
     */
    var gamesPrice: Int = 0
        private set
    /**
     * Getter for Firearms Price
     * @return firearmsPrice
     */
    var firearmsPrice: Int = 0
        private set
    /**
     * Getter for Medicine Price
     * @return medicinePrice
     */
    var medicinePrice: Int = 0
        private set
    /**
     * Getter for Machines Price
     * @return machinesPrice
     */
    var machinesPrice: Int = 0
        private set
    /**
     * Getter for Narcotics Price
     * @return narcoticsPrice
     */
    var narcoticsPrice: Int = 0
        private set
    /**
     * Getter for Robots Price
     * @return robotsPrice
     */
    var robotsPrice: Int = 0
        private set
    /**
     * Getter for Ship's inventory
     * @return inventory
     */
    /**
     * Setter for Ship's Inventory
     * @param inventory the ships inventory
     */
    var inventory: ShipInventory? = null
    private val travel: Travel
    private val shipStats: ShipStats
    private val rE: RandomEvent
    private val bank: Bank
    private val stock: Stock
    /**
     * Getter for ships Health
     * @return how much Health is left
     */
    var health: Int
        get() = shipStats.health
        set(health) {
            shipStats.health = health
        }
    /**
     * Getter for Fuel
     * @return amount of fuel left
     */
    val fuel: Int
        get() = shipStats.fuel

    val speed: Int
        get() = shipStats.speed

    val laser: Int
        get() = shipStats.laser

    val numNarcotics: Int
        get() = inventory!!.numNarcotics
    /**
     * getter method for Credits
     * @return the amount of credits tbe player has
     */
    val credits: Int
        get() = player!!.credits

    val shipName: String
        get() = player!!.shipString

    var bankCredits: Int
        get() = bank.bankCredits
        set(amount) {
            bank.bankCredits = amount
        }

    val stock1: Int
        get() = stock.stock1

    val stock2: Int
        get() = stock.stock2

    val stock3: Int
        get() = stock.stock3

    val stock4: Int
        get() = stock.stock4

    val stock5: Int
        get() = stock.stock5

    var stockOwned1: Int
        get() = stock.stockOwned1
        set(amount) {
            stock.stockOwned1 = amount
        }

    var stockOwned2: Int
        get() = stock.stockOwned2
        set(amount) {
            stock.stockOwned2 = amount
        }

    var stockOwned3: Int
        get() = stock.stockOwned3
        set(amount) {
            stock.stockOwned3 = amount
        }

    var stockOwned4: Int
        get() = stock.stockOwned4
        set(amount) {
            stock.stockOwned4 = amount
        }

    var stockOwned5: Int
        get() = stock.stockOwned5
        set(amount) {
            stock.stockOwned5 = amount
        }

    /**
     * Method which initializes travel, ship stats,
     * and Random Events which might occur.
     */
    init {
        travel = Travel()
        shipStats = ShipStats()
        rE = RandomEvent()
        bank = Bank()
        stock = Stock()
    }

    /**
     * Method which adds a Solar System to
     * the Universe.
     */
    fun addS() {
        for (i in 0..4) {
            universe!!.addSolarSystem()
        }

        val sols = universe!!.getSolarSystems()
        var incrementer = 0
        for (j in 0..4) {
            val planets = sols[j]!!.getPlanets()
            for (i in 0..2) {
                plans[incrementer] = planets[i]
                incrementer++
            }
        }

        playerLocation = plans[0]
    }

    /**
     * Method which initializes market goods
     */
    fun createMarketGoods() {
        water = createWater()
        furs = createFurs()
        food = createFood()
        ore = createOre()
        games = createGames()
        firearms = createFirearms()
        medicine = createMedicine()
        machines = createMachines()
        narcotics = createNarcotics()
        robots = createRobots()
    }

    /**
     * Creates Market place, and calculates prices of goods
     */
    fun createMarketplace() {
        setTechLevel(water!!)
        setTechLevel(furs!!)
        setTechLevel(food!!)
        setTechLevel(ore!!)
        setTechLevel(games!!)
        setTechLevel(firearms!!)
        setTechLevel(medicine!!)
        setTechLevel(machines!!)
        setTechLevel(narcotics!!)
        setTechLevel(robots!!)


        waterPrice = calculatePrice(water!!)
        fursPrice = calculatePrice(furs!!)
        foodPrice = calculatePrice(food!!)
        orePrice = calculatePrice(ore!!)
        gamesPrice = calculatePrice(games!!)
        firearmsPrice = calculatePrice(firearms!!)
        medicinePrice = calculatePrice(medicine!!)
        machinesPrice = calculatePrice(machines!!)
        narcoticsPrice = calculatePrice(narcotics!!)
        robotsPrice = calculatePrice(robots!!)
    }

    private fun createWater(): Marketplace {
        val waterObject = Marketplace()
        waterObject.Water()
        return waterObject
    }

    private fun createFurs(): Marketplace {
        val fursObject = Marketplace()
        fursObject.Furs()
        return fursObject
    }

    private fun createFood(): Marketplace {
        val foodObject = Marketplace()
        foodObject.Food()
        return foodObject
    }

    private fun createOre(): Marketplace {
        val oreObject = Marketplace()
        oreObject.Ore()
        return oreObject
    }

    private fun createGames(): Marketplace {
        val gamesObject = Marketplace()
        gamesObject.Games()
        return gamesObject
    }

    private fun createFirearms(): Marketplace {
        val firearmsObject = Marketplace()
        firearmsObject.Firearms()
        return firearmsObject
    }

    private fun createMedicine(): Marketplace {
        val medicineObject = Marketplace()
        medicineObject.Medicine()
        return medicineObject
    }

    private fun createMachines(): Marketplace {
        val machinesObject = Marketplace()
        machinesObject.Machines()
        return machinesObject
    }

    private fun createNarcotics(): Marketplace {
        val narcoticsObject = Marketplace()
        narcoticsObject.Narcotics()
        return narcoticsObject
    }

    private fun createRobots(): Marketplace {
        val robotsObject = Marketplace()
        robotsObject.Robots()
        return robotsObject
    }

    private fun calculatePrice(marketplace: Marketplace): Int {
        return marketplace.calculatePrice()
    }

    private fun setTechLevel(marketplace: Marketplace) {
        marketplace.techLevel(playerLocation!!.techLevel)
    }

    /**
     * Getter for the distance between two points
     * @param x1 first x location
     * @param x2 second x location
     * @param y1 first y location
     * @param y2 second y location
     * @return the distance
     */
    fun getDistance(x1: Int, x2: Int, y1: Int, y2: Int): Int {
        return travel.calculateDist(x1, x2, y1, y2)
    }

    /**
     * Getter for Fuel Cost over a distance
     * @param distance distance
     * @return cost of fuel
     */
    fun getFuelCost(distance: Int): Int {
        return travel.calculateFuel(distance)
    }

    /**
     * Method to update fuel used in ship stats
     * @param fuelUse fuel used
     */
    fun useFuel(fuelUse: Int) {
        shipStats.useFuel(fuelUse.toDouble())
    }

    /**
     * Boolean Method to check if there are Pirates
     * @return true if pirates are present
     */
    fun pirateCheck(): Boolean {
        return rE.encounterPirates()
    }

    /**
     * Boolean Method to check if there are Police
     * @return true if police are present
     */
    fun policeCheck(): Boolean {
        return rE.encounterPolice()
    }

    /**
     * Boolean Method to check if there are Traders
     * @return true if traders are present
     */
    fun traderCheck(): Boolean {
        return rE.encounterTraders()
    }

    fun deposit(amount: Int) {
        bank.deposit(amount)
    }

    fun withdraw(amount: Int) {
        bank.withdraw(amount)
    }

    fun updateInterest() {
        bank.addInterest()
    }

    fun refuelShip() {
        shipStats.refillFuel()
    }

    fun upgradeSpeed() {
        shipStats.upgradeSpeed()
    }

    fun upgradeLaser() {
        shipStats.upgradeLaser()
    }

    fun fixShip() {
        shipStats.fixShip()
    }

    fun updateStock() {
        stock.updateStock()
    }

    companion object {
        private val totalPlanets = 15
    }

}
