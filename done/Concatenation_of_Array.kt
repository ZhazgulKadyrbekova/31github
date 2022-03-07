fun main() {
    val arr = getConcatenation(intArrayOf(1,3,2,1))
    for (i in arr)
        println(i)
}

fun getConcatenation(nums: IntArray): IntArray {
    return intArrayOf(*nums, *nums)
}