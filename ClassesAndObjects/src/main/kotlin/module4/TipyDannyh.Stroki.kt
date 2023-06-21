package module4
fun main () {
    /*                                 ТИПЫ ДАННЫХ. СТРОКИ

    Цели и задачи:
    - Узнать, что такое строковый тип
    - Понять, как работать с переменными строкового типа
    - Разобраться, как инициализировать строковые переменные

    Строки в Kotlin представены типом String.

    String - это последовательность символов Char.
    Представляет из себя произвольный текст, заключенный в двойные кавычки.

    var str: String = "Hello Kotlin"

    Kotlin представляет два вида строк

    Обычная строка. Может содержать произвольный текст. Поддерживает перенос строк.
    Заключаеться в тройные ковычки.

    Экранированная строка. Помимо текста может содержать управляющие и
    экранированные символы. */

    val escapedString = "Hello Kotlin. \nThis is an escaped\tstring"
    val commonString = """Hello kotlin. 
        |This is a
        |common string
     """.trimMargin()
    println(escapedString)
    println(commonString)
    /*  \n - символ переноса строки

    строка состоит из символов Char и к ним можно обратиться по индексу. И нужно помнить,
    что первый индекс строки или массива имеет индекс - 0. Пример: */

    val secondChar = commonString[1]    // обращяемся ко второму символу переменной commonString
    println(secondChar) // выводиться второй символ - e

    /* Самые распространенные операци над строками - это конкатинация или сложение строк,
    использование строковых шаблонов, поиск символа и подстроки, замена символов или подстроки
    Пример конкатинации(сложения):    */

    val hello = "Hello"
    println(hello + "kotlin")    // выводиться Hellokotlin

    // строки это неизменяемый объект при любой операции модификации строки будет создаватья новый объект

    println(hello.toUpperCase()) // функция toUpperCase() возводит все символы в строке в верхний регистр и получаем HELLO
    println(hello)   // при этом первоначальная строчка осталась без изменений и вывелось Hello

    // Задача: длина строки %str% - %length% символов

    val longStr = "The longest string you've ever seen"
    val resultString = "Length of " + "\"" + longStr + "\"" + longStr.length + " symbols" // length - функция выводит количество символов
    println(resultString) // выводиться Length of "The longest string you've ever seen"35 symbols

    // можно сделать проще с помощью строковых шаблонов. Шаблон начинаеться с символа $ и состоит из простого имени переменной
    // либо начинаеться со символа $ и вычесляемого выражения заключенного в фигурные скобки {}

    val resultString2 = "Length of \"$longStr\" - ${longStr.length} symbols"
    println(resultString) // выводиться Length of "The longest string you've ever seen"35 symbols

    /*  Тип String так же предоставляет набор функций для взаимодействия и обработки строк, одной из таких функций
    является функция contains  Она проверяет содержиться ли в исходной строке переданный символ или строка, результатам
    функции являеться значение типа Boolean */

    val str = "Hello kotlin"
    println(str.contains("H")) // проверка содержится ли в нашей строке символ H
    println(str.contains("kotlin")) // содержится ли в нашей строке слово kotlin
    println(str.contains("world")) //  содержится ли в нашей строке слово world

    /* Получаем:
        true
        true
        false    */

    // Функция replace и ее прозводная. Эти функции позволяют заменить часть символов в строке на переданную в эту функцию

    println(str.replace("l", "2")) // заменяем все символы l на 2
    // Получаем :     He22o kot2in

    // Функция replaceFirst заменяет первое вхождение символа или строки в изначальной строке. Любая модификация строк
    // будет создавать новый объект. результатом функий replace и replaceFirst будет новая строка

    val replaceFirst = str.replaceFirst("Hello", "First")
    println(replaceFirst)

    // Получаем : First kotlin

    // Тип String щчень большой и гибкий, он позволет проделывать со строками множество вещей. Со всеми функциями можно ознакомиться на сайте Kotlin
}