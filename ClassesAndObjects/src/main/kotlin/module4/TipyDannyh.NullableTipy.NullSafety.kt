package module4

fun main() {
    /*                                ТИПЫ ДАННЫХ. NULLABLE ТИПЫ. NullSafety

     Цели изадачи:
     - Узнать, что такое nullable тип
     - Понять, как работать с переменными nullable типа
     - Разобраться, как инициализировать nullable переменные

    Во всех современных языках ппрограммиррования есть такое понятие, как NullPointer
    или просто Null.

    Null - это отсутсвие ссылки у переменной. Она не ссылаеться ни на какую область в памяти.

    Щсновная проблема - попытка доступа к отсутсвующему адресу в памяти. Результат этой
    ошибки - критическое и некорректное завершение программы.

    У всех типов в Kotlin есть "тип-двойник", который позволяет переменным этого типа иметь значение null.

    Non-null типы
    Int, String, Double, Float и тд. Переменные этих типов не могут принимать значение null.

    Nullable тиы
    Int?, String?, Double?, Float? и тдю Переменные этих типов могут принимать значение null.   */

    var number: Int? = null

    var nonNullString: String = "Hello Kotlin"
    var nullableString: String? = null

   // println(nullableString.toUpperCase())    - так нельзя записывать null переменную c функцией, а необходимо записать со хнаком?
    println(nullableString?.toUpperCase())  // выводиться null
    println(nullableString)  // выводиться null
    println(null) // тоже выводиться null, но это не идентичные значаения. Т.к. в данном случае это просто текст, это не объект и не значение объекта

    /* Переменную null можно потом объявить

    var number: Int? = null
    number = 10        */

    // Можно явно проверить или переменная null

    if (nullableString != null)      // код внутри ветки if выполняеться, если nullableString не является null
        println(nullableString.toUpperCase())


}