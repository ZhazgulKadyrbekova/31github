fun main() {
//    println(equalFrequency("abcc"))
//    println(equalFrequency("aazz"))
//    println(equalFrequency("bac"))
//    println(equalFrequency("cbbd"))
    println(equalFrequency("aca"))
}

fun equalFrequency(word: String): Boolean {
    println(word)
    val list = word.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount().values.toList()
    println(list)
    val res = list.groupingBy { it }.eachCount()
    println(res)
    if (res.keys.filter { it != 1 }.isEmpty()) return true
    if (res.values.filter { it == 1 }.size == 1) return true
    return false
//    var prev = list.first(); var i = 0; var isBigger = false
//    while (i < list.size) {
//        val value = Math.abs(list[i] - prev)
//        println(value)
//        if (value == 1 && !isBigger) isBigger = true
//        else if (value == 1) return false
//        prev = list[i]
//        i++
//    }
//    if (!isBigger) return false
//    return true
}