package module8.practical

class TV(val brand: String, val model: String, val diagonal: String) {


  /*  var tvIsOn = false
    var volume: Int = 20  // звук в телевизоре(по умолчанию на 20)
    var channel: String // список каналов для телевизора


    fun tvOn(){          // функция включения телевизора
        println("TV on")
        tvIsOn = true
    }
*/

    fun tvOff(){         // функция выключения телевизора
        println("TV off")
       // tvIsOn = false
    }
/*
    fun channelList() {      // список каналов - внутреннее свойство телевизора, недоступно для чтения

    }
    fun volumeСheck(a: Int): Int {    // проверка уровня звука от 0-100 if (volume in 0.. 100) true
        if 
            else false
   // }

    fun volumeOnTv(a: Int = 10, b: Double): Double { // увеличение громкости на заданую величину a - 10 шкала по кторой добовляеться звук,  b - время которое мы держим кнопку увеличения звука
        a * b = volume
        if volume >= 100, то volume = 100    // найти что подставить вместо то
        return volume
    }
    fun volumeOffTv(a: Int = 10, b: Double): Double {        // уменьшение громкости на заданнуювеличину
        volume - (a * b)
        if volume <= 0, то volume = 0   // найти что подставить вместо то
        return volume
    }
*/

// свойство максимальная громкость - внутренней свойство, значение константное, поэтому распологаеться в объекте-компаньоне этого класса.
    // RU.TV     Sony Sci-Fi    5 International   FILMUADRAMA   Fox Life      Fox    Dorama    Star Family     BOLT    TRASH    STAR Cinema   список каналов
}