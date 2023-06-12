package module8

import module8.lesson2.Car1

fun main() {
 //   val vw = Car(model = "B6", color = "White")
 //   val lada = Car()
 //   printInfo(vw)
 //   printInfo(lada)


    val vw = Car1(model = "B6", color = "White")

    printInfo(vw)

}
fun printInfo(car: Car1) {
    println("Brand - ${car.brand} ${car.model} ${car.color}")
}


