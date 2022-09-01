fun main() {
    println(digitSum("11111222223", 3))
}

fun digitSum(s: String, k: Int): String {
    var stringBuilder = StringBuilder()
    var text = s
    var size = text.length
    var i: Int
    var count = 0
    while (size > k) {
        i = 0
        while (i < size) {
            count += text[i].toInt() - 48
            println("----\t$i\t${text[i]}\t$count")
            if ((i+1) % k == 0 || i == size - 1) {
                println("--------$i\t${text[i]}\t$count")
                stringBuilder.append(count)
                count = 0
            }
            i++
        }
        text = stringBuilder.toString()
        println("$size\t\t$text")
        stringBuilder = StringBuilder()
        size = text.length
    }
    return text
}