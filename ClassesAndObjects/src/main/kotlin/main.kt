fun main () {
 val auto = Car()

 println("Info car")
 println("${auto.brand} ${auto.model} ${auto.color} color")

 auto.start()
 auto.move()
 auto.move()
 auto.move()
 auto.move()
 auto.stop()
}