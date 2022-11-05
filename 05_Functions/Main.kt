fun main() {
    val stringR = "F2p)v\"y233{0->c}ttelciFc"
    val subStr2 = stringR.substring(12).reversed()
    val subStr1 = stringR.substringBefore('-')
    val str1 = myFunc(subStr1) { it + 1 }.replace('5', 's', ignoreCase = true).replace('4', 'u', ignoreCase = true)
    val firstP = myFunc2(str1) { it - 3 }.replace('0', 'o', ignoreCase = true)
    val firstK = myFunc3(subStr2) { it - 4 }.replace('_', ' ', ignoreCase = true)
    println(firstP)
    val newfirstK = firstK.trimStart()
    println(newfirstK)
}

fun myFunc (text: String, transformChar: (Char)->Char): String {
    return text.map { it + 1 }.joinToString("")
    return text.map { transformChar }.joinToString("")

}
fun myFunc2 (text: String, transformChar: (Char)->Char): String {
    return text.map { it - 3 }.joinToString("")
    return text.map { transformChar }.joinToString("")

}
fun myFunc3 (text: String, transformChar: (Char)->Char): String {
    return text.map { it - 4 }.joinToString("")
    return text.map { transformChar }.joinToString("")

}
