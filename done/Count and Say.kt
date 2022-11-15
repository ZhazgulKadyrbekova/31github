import java.lang.StringBuilder

fun main() {
    println(countAndSay(4))
}

fun countAndSay(n: Int): String {
    if (n == 1) return "1"
    var i = 0; var res = "1"
    while (i < n - 1) {
        res = say(res)
        i++
    }
    return res
}
fun say(text: String): String {
    val sb = StringBuilder()
    var freq = 1; var i = 0; val size = text.length - 1
    if (size == 0) return sb.append(1).append(text).toString()
    var fir = text[0]; var sec = text[1]
    while (i < size) {
        fir = text[i]
        sec = text[i+1]

        if (fir == sec && i == size - 1) {
            freq++
            sb.append(freq).append(fir)
        }
        if (fir == sec) freq++
        else {
            sb.append(freq).append(fir)
            freq = 1
        }

        i++
    }

    if (fir != sec) {
        sb.append(1).append(sec)
    }
    return sb.toString()
}