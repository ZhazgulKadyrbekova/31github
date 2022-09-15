fun main() {
    println(largestOddNumber("52"))
    println(largestOddNumber("4206"))
    println(largestOddNumber("35427"))
}

fun largestOddNumber(num: String): String {
    var txt = num
    while (txt.isNotEmpty()) {
        val last = txt.last().toInt()
        if (last % 2 == 1)
            return txt
        else txt = txt.substring(0, txt.length - 1)
    }
    return ""
}