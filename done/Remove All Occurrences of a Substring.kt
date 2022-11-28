fun main() {
    println(removeOccurrences("aabababa", "aba"))
}

fun removeOccurrences(s: String, part: String): String {
    var txt = s
    while (txt.contains(part)) {
        println(txt)
        txt = txt.replaceFirst(part, "")
        println(txt)
    }
    return txt
}
