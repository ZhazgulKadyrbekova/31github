fun main() {
    var t: Int = readLine()!!.toInt()

    while (t-- > 0) {
        val text = readLine()!!.split(" ")

        val n = text[0].toLong()
        val b = text[1].toInt()

        if (b == 1) {
            println(n); continue
        }
//        1000000000000000000
        var i: Long = b.toLong(); var count = 0
        while (i <= n) {
            if (i / b == customDivide(i, b)) {
                println("$i\t$b")
                count++
            }
            i += b
        }
        println(count)
    }
}

fun customDivide(a: Long, b: Int): Long {
//    print("$a\t$b\t")
    val divisor = a.toString(); var res: Long = 0
    for (i in divisor) {
        val temp = (i.toInt() - 48) / b
        res = res * 10 + temp
    }
//    println("$res")
    return res
}