package module8.lesson2

import kotlin.random.Random
class Car(val brand: String = "Lada", val model: String = "Vesta", val color: String = "Black") {

    constructor(descriptor: Pair<String, String>, color: String): this(
        brand = descriptor.first,
        model = descriptor.second,
        color = color)

    {
        println("secondary constructor")
    }
    init {
        println("Car init")
    }
    val currentSpeed =0.0
    init {
        println("Second init")
    }
}