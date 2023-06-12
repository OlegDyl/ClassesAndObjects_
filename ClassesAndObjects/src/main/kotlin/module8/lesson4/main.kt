package module8.lesson4

fun main() {
    val tower1 = EiffelTower
    val tower2 = EiffelTower

    println("tower1 backlights on? - ${tower1.backlightsOn}")
    println("tower2 backlights on? - ${tower2.backlightsOn}")

    tower1.turnOnBacklights()

    println("tower1 backlights on? - ${tower1.backlightsOn}")
    println("tower2 backlights on? - ${tower2.backlightsOn}")

   // val classType = Car.getCarClass(3.8)
   // println(classType)


}