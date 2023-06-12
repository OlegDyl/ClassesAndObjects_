package module8.practical

class TV(val brand: String, val model: String, val diagonal: String) {

    fun tvOn(){          // включен/выключен свойства доступные для чтения и недоступные для записи

    }

    fun tvOff(){         // включен/выключен свойства доступные для чтения и недоступные для записи

    }

    fun channelList() {      // список каналов - внутреннее свойство телевизора, недоступно для чтения

    }

    fun volumeOnTv() {         // увеличение громкости на заданую величину

    }
    fun volumeOffTv() {        // уменьшение громкости на заданнуювеличину

    }


// свойство максимальная громкость - внутренней свойство, значение константное, поэтому распологаеться в объекте-компаньоне этого класса.
    // RU.TV     Sony Sci-Fi    5 International   FILMUADRAMA   Fox Life      Fox    Dorama    Star Family     BOLT    TRASH    STAR Cinema   список каналов
}