fun main() {
    println(maximumWealth(arrayOf(intArrayOf(2,8,7), intArrayOf(7,1,3), intArrayOf(1,9,5))))
}
//[2,8,7],[7,1,3],[1,9,5]]
fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    for (i in accounts) {
        val sum = getSum(i)
        if (max < sum) max = sum
    }
    return max
}

fun getSum(arr: IntArray): Int {
    var sum = 0
    for (i in arr)
        sum += i
    return sum
}