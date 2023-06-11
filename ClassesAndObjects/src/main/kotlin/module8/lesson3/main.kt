package module8.lesson3

fun main() {
    val renault = Car(descriptor = "Renault" to "Logan", color = "Brown")

    renault.currentSpeed = 1000.0
    renault.currentSpeed = -1000.0

    println("current speed - ${renault.currentSpeed}")
}