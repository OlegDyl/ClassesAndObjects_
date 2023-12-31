package module5

fun main() {
    /*                                     ФУНКЦИИ

    Цель:
    = Научиться объявлять и определять функции
    - Изучить их свойства
    - Напишем собственную функцию, которая решает задачу

    Функция это фрагмент кода, который вызываеться из других мест программы. Другими словами -
    это подпрограмма, которую можно вызывать из других частей программы, причем неограниченое
    количество раз.

    Функции используються для того, чтобы:
    - Избегать избыточности и дублирования кода
    - Структурировать и декомпозировать программу

    Функции могут принимать в себя какие-либо значения. Входные параметры функции и являются тем самым входом в функцию.
    Функция также может возвращять результат своей работы и это - выход функции. Функция может вовсе не принимать никаких
    параметров и не иметь возвращяемого значениния.

                                   Сигнатура функции

    Сигнатура функции - это набор параметров, однозначно описывающий функцию
    К этим параметрам относяться:
    - Название функции
    - Параметры функции(их количество и типы)
    - Возвращяемое значение функции
    */

    val juniorGrossSallary = 50_000
    val middleGrossSallary = 134_000
    val seniorGrossSallary = 167_000

    calculatteSaving(juniorGrossSallary, 0.5)  // сама функция внизу
    calculatteSaving(middleGrossSallary, 0.8)
    calculatteSaving(seniorGrossSallary, 0.1)

    //  Чтобы функция была видна из классов или других мест - ее необходимо выносить за {} main, class и тд.

    /*                                Основные принцыпы

     = Функции должны быть максимально обособлены и независимы друг от друга
     - Функции не не должны влтиять друг на друга или какие-то общие данные. Вызываемая функция лишь
     предоставляет результат вычисления, а что делать с этим результатом и как его нужно обработать -
     это лежит в зоне ответсвенности вызывающей функции
     - Функция решает свою атомарную задачу. Эту задачу определяет разаработчик
     - Более сложные задачи решаються с помощью компановки различных функций
    */
  }

fun calculatteSaving(salary: Int, rate: Double) {
    val netSalary = salary * 0.87
    val bank = netSalary * rate * 12
    println("With a salary of $salary person can accumulate $bank in 1 year")
}