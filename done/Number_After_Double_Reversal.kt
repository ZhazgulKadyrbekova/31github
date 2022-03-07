fun main() {
    println(isSameAfterReversals(526))
    println(isSameAfterReversals(1800))
    println(isSameAfterReversals(0))
}

fun isSameAfterReversals(num: Int): Boolean {
    val first = getReverse(num)
    val second = getReverse(first)
    return num == second
}

fun getReverse(num: Int): Int {
    var res = 0
    var x = num
    while (x > 0) {
        res *= 10
        res += x % 10
        x /= 10
    }
    return res
}