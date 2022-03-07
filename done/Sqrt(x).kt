fun main() {
//    println(mySqrt(8))
//    println(mySqrt(0))
//    println(mySqrt(1))
//    println(mySqrt(2))
//    println(mySqrt(3))
    println(mySqrt(2147395600)) //46340
//    println(mySqrt(46340)) //215
}

fun mySqrt(x: Int): Int {
    if (x == 0) return 0
    if (x == 1) return 1
    var res: Long = 1
    var i: Long = 2
    while (i*i <= x) {
        res = i
        i++
    }
    return res.toInt()
}

