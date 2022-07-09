fun main() {
    val arr = intArrayOf(12,17,15,13,10,11,12)
    println(threeConsecutiveOdds(arr))
}

fun threeConsecutiveOdds(arr: IntArray): Boolean {
    var count = 0
    for (i in arr) {
        if (i % 2 == 1) count++
        else {
            count = 0
        }
        if (count == 3) return true
    }
    return false
}