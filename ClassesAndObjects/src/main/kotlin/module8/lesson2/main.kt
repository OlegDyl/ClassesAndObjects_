package module8

import module8.lesson2.Car

fun main() {
 //   val vw = Car(model = "B6", color = "White")
 //   val lada = Car()
 //   printInfo(vw)
 //   printInfo(lada)


    val vw = Car(model = "B6", color = "White")

    printInfo(vw)

}
fun printInfo(car: Car) {
    println("Brand - ${car.brand} ${car.model} ${car.color}")
}


