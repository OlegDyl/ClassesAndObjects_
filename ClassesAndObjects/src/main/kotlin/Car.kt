import kotlin.random.Random

class Car {
    val brand = "Audi"
    val model = "A3"
    val color = "White"

    fun move() {
        val moves = Random.nextInt(1, 100)
        println("Car move $moves km")
    }

    fun start(){
        println("Start car")
    }
    fun stop(){
        println("Stop car")
    }
}