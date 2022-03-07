fun main() {
//    println(firstBadVersion(5)) //4
//    println(firstBadVersion(1)) //1
    println(firstBadVersion(2126753390))
}

fun firstBadVersion(n: Int) : Int {
    var left: Int = 0
    var right: Int = n

    while (left < right) {
        val mid: Int = left + (right - left) / 2
        println("$left\t$mid\t$right")
        val value: Boolean = isBadVersion(mid)

        if (value) right = mid
        else left = mid + 1
    }
    return right
}

fun isBadVersion(n: Int): Boolean {
    return (n == 1702766719)
}