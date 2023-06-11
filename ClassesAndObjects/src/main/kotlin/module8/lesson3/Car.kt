package module8.lesson3

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
    var currentSpeed = 0.0
    get() {
        println("current speed detter")
        return field
    }
    set(value) {
        field = value
        println("current speed getter")
    }
    private var fuelCount = 0.0

    fun accelerate (speed: Double) {
        val needFuel = speed * 0.1
        if (fuelCount > needFuel) {
            currentSpeed += speed
            useFuel(needFuel)
        } else
            println("Car has not enough fuel")
    }

    fun decelerate(speed: Double){
        //currentSpeed = maxOf(0, currentSpeed - speed)
        val finalSpeed = currentSpeed - speed
        currentSpeed = if (finalSpeed < 0) 0.0
        else finalSpeed
    }
    fun useFuel(fuelCount: Double) {
        this.fuelCount -= fuelCount
    }

    init {
        println("Second init")
    }
}