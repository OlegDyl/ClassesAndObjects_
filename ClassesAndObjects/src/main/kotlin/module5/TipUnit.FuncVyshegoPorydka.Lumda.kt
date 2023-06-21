package module5

import java.time.chrono.ChronoPeriod

fun main()    {  // !!!!!! Доделать 5.3 9 минута!!!!!!!!!!!!!!!





   /*                          ТИП Unit. Функциональный тип. Функции
                                высшего порядка и лямбда-выражения

    Тип Unit - описывает отсутствие возвращаемого значения функции При объявлении функции
    без возвращаемого значения он автоматически подставляется компилятором и явно его
    указывать не нужно

     Тип Unit необходим при работе с функциональными типами

     Если функция ничего не возвращает, то ей автоматически присваивается тип Unit.
     Пример:

     fun main() {
     println(test())  //  выводиться Unit
     }

     fun test() {
     }

     Функциональный тип

     Функциональный тип - это особый тип, который позволяет работать с лямбда-выражениями
     и функциями высшего порядка. Описывает сигнатуру используемой функции или лямбда-выражения

     Функции высшего порядка - функции, которые могут принимать в качестве аргумента другие функции
     и лямбда выражения, а также использовать их в качестве возвращаемого значения */

     fun multiply(func: () -> Unit) { // Описывает функцию которую, может передать. В этом случае описывает сигнатуру функции которая
                                      // не принимает аргументы и не имеет возвращаемого значения

     }

     // val type : (Int) -> String  // такой тип описывает функцию которая принимает один аргумент типа Int и имеет возвращаемый тип String

     // val type : (Int, Double, Int) -> Double // такой тип описывает функцию которая может принимать три аргумента


     /*                            Анонимные функции

     Функциональный тип позволяет также присваивать переменным анонимные функции и лямбда-выражения.

     Анонимная функция - функция, у которой нет имени. Обращение к этой функции происходит с помощью переменной функционального типа. */

     val anonimous: (Int) -> Unit = fun(a: Int) { println(a) }
     anonimous(123)  // выводит 123

    /* Лямбда-функция это анонимная функция записанная в виде выражения.

    Лямбда выражения имеет следующий синтаксис: выражение всегда заключено в фигурные скобки {},
    при этом с левой стороны до оператора стрелки могут находиться параметры, которые передаются в функцию,
    а справа от стрелки -> находятся непосредственно тело самой функции. Синтаксис лямбда-выражений не предусматривает
    явного указания типа возвращаемого значения.
    Возвращаемым значением в лямбда-выражении всегда считается последняя строка тела функции
    Примеры лямбда-выражений:                                                                 */

    val lambda = { println("HelloWorld")}
    val lambdaWithParams = { message: String -> println(message) }
    val lambdaWithParamAndReturnValue = { a: Int, b: Int -> a * b }

    println(lambda())  // выводиться HelloWorld
    println(lambdaWithParams("Hello")) // выводиться Hello
    println(lambdaWithParamAndReturnValue(1, 5)) // выводиться 5

   /*  В отличии от анонимных функций в лямбда-функциях нельзя явно указывать return. Пример как нужно

    val lambdaWithParamAndReturnValue = { a: Int, b: Int ->
        val mult = a * b
        println(mult)
    }
    */
    // Решим задачку с типом String: подсчитать сколько раз среди символов заданной строки встречается
    // латинский символ "e".  Решим ее с помощью функции count() типа String. В Kotlin две функции count()
    // Первая подсчитывает общее число символов, вторая подсчитывает количество символов удовлетворяющих условию

    val str = "This is a typical task for developer interview"
    println(str.count {char -> checkSymbol(char)})

   // fun checkSymbol(char: Char) : Boolean = char == 'e' - эта функция записывается вне функции main(она и записана в конце)

    // когда у лямды только один аргумент его можно не определять явно, а использовать специальное ключевое слово - it

     println(str.count { it == 'e' })

    // Пример задачи в которой нужно убрать все гласные буквы из строки. Будем использовать функцию filter()

    val vowels = "aeoiu"
    println(str.filter { it !in vowels }) // этот символ не входит в строчку, где гласные буквы и выводиться строка без гласных букв

    // Еще пример с функцией из предыдущих уроков про зарплаты:

    val first = calculateSavings(30000, 0.12, 8, printinfo = {salary, rate, period, bank ->
        println("First member's bank: $bank")
    })
    val second = calculateSavings(55000, 0.20, 8, printinfo = {salary, rate, period, bank ->
        println("Second member's bank: $bank")
    })

    println(first + second)

    val third = calculateSavings(50000, 0.30, 12, printinfo = {salary, rate, period, bank ->
        println("Salary: salary, rate: ${rate*100}%, period:$period months, bank: $bank")
    })




}
fun checkSymbol(char: Char) : Boolean = char == 'e'

fun calculateSavings(salary: Int,
                     rate: Double = 0.3,
                     period: Int = 12,
                     printinfo: ((salary: Int, rate: Double, period: Int, bank: Double) -> Unit)? = null) : Double {
    val netSalary = salary * 0.87
    val bank = netSalary * rate * 0.87
    printinfo?.invoke(salary, rate, period, bank)
    println("Salary: $salary, rate:${rate * 100}%, period: $period months, $bank in 1 year")
    return bank
}