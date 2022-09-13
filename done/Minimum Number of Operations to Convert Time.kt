fun main() {
    println(convertTime("02:30","04:35"))
}

fun convertTime(current: String, correct: String): Int {
    val fir = current.split(':')
    val sec = correct.split(':')
    val firMin = fir[1].toInt()
    var secMin = sec[1].toInt()
    val isSecMinBigger = secMin >= firMin
    var count: Int
    if (isSecMinBigger) {
        count = sec[0].toInt() - fir[0].toInt()
    } else {
        count = sec[0].toInt() - fir[0].toInt() - 1
        secMin += 60
    }
    secMin -= firMin

    count += secMin / 15
    secMin %= 15

    count += secMin / 5
    secMin %= 5

    count += secMin

    return count
}