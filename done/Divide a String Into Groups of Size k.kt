fun main() {
    println(divideString("abcdefghi", 3, 'x'))
//    println(divideString("abcdefghij", 3, 'x'))
}

fun divideString(s: String, k: Int, fill: Char): Array<String> {
    val res = mutableListOf<String>()
    var stringBuilder = StringBuilder()
    var i = 1
    for (letter in s) {
        stringBuilder.append(letter)
        if (i % k == 0) {
           res.add(stringBuilder.toString())
           stringBuilder = StringBuilder()
        }
        i++
    }
    if (stringBuilder.isNotEmpty()) {
        var size = stringBuilder.length
        while (size < k) {
            stringBuilder.append(fill)
            size++
        }
        res.add(stringBuilder.toString())
    }
    return res.toTypedArray()
}