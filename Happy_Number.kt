fun main() {
    println(isHappy(2))
//    println()
//    println(isHappy(19))
}

fun isHappy(n: Int): Boolean {
    if (n == 1) return true

    return isHappy(getSum(n))
}

fun getSum(m: Int): Int {
    var sum = 0
    var n = m
    while (n/10 > 0) {
        sum += getSquare(n%10)
        n /= 10
    }
    return sum
}

fun getSquare(n: Int): Int {
    return n*n
}