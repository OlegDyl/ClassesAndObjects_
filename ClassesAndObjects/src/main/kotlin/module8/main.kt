package module8

fun main() {
  /*  val vw = Car(brand = "VW", model = "Beetle", color = "Green")
    val lada = Car(brand = "Lada", model = "Vesta", color = "Yellow")
    val bmw = Car(brand = "BMW", model = "X6")

    printInfo(vw)
    printInfo(lada)
    printInfo(bmw)*/
    val vw = Car(brand = "VW", model = "Beetle", color = "Green")
    val renault = Car(descriptor = "Renault" to "Logan", color = "Brown")

    printInfo(vw)
    printInfo(renault)
}

fun printInfo(car: Car) {
    println("Brand - ${car.brand}, model - ${car.model}, color - ${car.color}")
}

