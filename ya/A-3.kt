fun main() {
    val text = readLine()!!.split(" ")
    var h = text[0].toInt()
    var m = text[1].toInt()

    h = 12 - h
    if (h == 12) h = 0

    m = 60 - m
    if (m == 60) m = 0
    println("$h $m")
}