fun main() {
    val arr = intArrayOf(12,17,15,13,10,11,12)
    println(maxAscendingSum(arr))
}

fun maxAscendingSum(nums: IntArray): Int {
    var max = Int.MIN_VALUE
    var sum = 0
    var prev = 0
    println("i\tsum\tmax")
    for (i in nums) {
        sum += i
        if (i <= prev) {
            sum = i
        }
        if (max < sum) {
            max = sum
        }
        prev = i
        println("$i\t$sum\t$max")
    }
    return max
}