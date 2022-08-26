fun main() {
    println(isSumEqual("acb","cba","cdb"))
}

fun isSumEqual(firstWord: String, secondWord: String, targetWord: String): Boolean {
    return getIntFromString(firstWord) + getIntFromString(secondWord) == getIntFromString(targetWord)
}

fun getIntFromString(text:String): Int {
    var sum = 0
    var power = 1
    for (i in text.reversed()) {
        sum += (i.toInt() - 97) * power
        power *= 10
    }
    return sum
}