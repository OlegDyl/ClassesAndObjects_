package module8.lesson4

object EiffelTower {
    var backlightsOn = false
    val heigh = 324
    fun turnOnBacklights() {
        println("backlights on")
        backlightsOn = true
    }

    fun turnOffBacklights() {
        println("backlights off")
        backlightsOn = false
    }
}