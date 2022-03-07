fun main() {
//    println(reverse(123))
//    println(reverse(-123))
//    println(reverse(120))
    println(reverse(1534236469))
}

//2147483648

fun reverse(x: Int): Int {
    var res: Long = 0
    val sign = (x >= 0)
    var num = Math.abs(x)
    while (num > 0) {
//        val t =
//        if (num < 10) {
//            if (num > 2 && res > 100000000) return 0
//            if (num == 2 && res > 214748364) return 0
//            if (num == 2 && res == 214748364 && (t == 8 || t == 9)) return 0
//        }
        res *= 10
        res += num%10
        num /= 10
//        println("$x\t$res\t$num")
        if (res >= Int.MAX_VALUE) return 0
    }
    if (sign) return res.toInt()
    return (res - 2*res).toInt()
}