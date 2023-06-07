fun main() {
    println("Enter a number:")
    var n: Int = readLine()?.toIntOrNull() ?: return
    while (n <= 0) {
        println("Error!")
        println("Enter another number: ")
        n = readLine()?.toIntOrNull() ?: return
    }
    val addNumberPhone = mutableListOf<String>()
    var a = 1
    for (i in 1..n) {
        println("Enter phone numbers №$a:")
        a++
        addNumberPhone.add(readLine().toString())
    }
    println(addNumberPhone)

    val filterSeven = addNumberPhone.filter { it.contains("+7") }
    println(filterSeven)
    println(addNumberPhone.toSet())
    println(addNumberPhone.toSet().size)

    val sumPhoneNumbers = addNumberPhone.sumOf { it.length }
    println("${addNumberPhone.sumOf { it.length }}")

    val numberAndName = mutableMapOf<String, String>()
    addNumberPhone.forEach {
        print("Enter name for $it - ")
        numberAndName[it] =
            readlnOrNull() ?: ""
    }

    numberAndName.forEach { (key, value) -> println("Name: $value. Number phone: $key") }
}