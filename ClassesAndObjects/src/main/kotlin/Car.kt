import kotlin.random.Random

class Car {
    val brand = "Audi"
    val model = "A3"
    val color = "White"

    fun move() {
        val distance = Random.nextInt(1, 10)
        println("Car passed $distance km")
    }

    fun start() {
        println(" Start car")
    }

    fun stop() {
        println(" Stop car")
    }
}