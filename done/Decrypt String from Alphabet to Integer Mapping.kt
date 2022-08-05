fun main() {
    println(freqAlphabets("10#11#12"))
}

fun freqAlphabets(s: String): String {
    val size = s.length - 1
    val stringBuilder = StringBuilder()
    var i = 0
    while (i <= size) {
        var intVal: Int
//        println("i: $i\ts[i+2]: ${s[i+2]}")
        if (i + 2 <= size && s[i+2] == '#') {
            intVal = (s[i].toInt() - 48) * 10 + s[i+1].toInt() - 48
            i += 2
        }
        else {
            intVal = s[i].toInt() - 48
        }
        println("intVal: $intVal")
        stringBuilder.append((intVal+96).toChar())
        i++
    }
    return stringBuilder.toString()
}