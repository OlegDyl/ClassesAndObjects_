import platform.windows.OleGetAutoConvert

fun main() {

       var name: String = "oleg"

       var family: String = "dyliuk"

       var firstName: String = name

       var LastName: String = family

       var height: Double = 1.82

       var weight: Float = 84F

       var isChild = height < 1.5 || weight < 40

       var info = "firstName: " + firstName + " LastName: " + LastName + " height: " +  height + " weight: " +  weight + " isChild: " +  isChild.toString()
       println("info: " +  info)
       /*Данная программа выводит мои данные: имя, фамилия, рост, вес и являюсь ли я ребенком */
}