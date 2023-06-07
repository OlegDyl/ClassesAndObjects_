package module8

fun main() {
    val vw = Car(brand = "VW", model = "Beetle", color = "Green")
    val lada = Car(brand = "Lada", model = "Vesta", color = "Black")
    val bmw = Car(brand = "BMW", model = "3-series", color = "Yellow")

   // printInfo(vw)

    fun printInfo(car: Car){
        println("Brand - ${car.brand}, model - ${car.model}, color - ${car.color}")
    }

}