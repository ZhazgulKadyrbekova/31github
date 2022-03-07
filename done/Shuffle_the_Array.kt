fun main() {
    val arr = shuffle(intArrayOf(1,1,2,2), 2)
    for (i in arr)
        println(i)
}

fun shuffle(nums: IntArray, n: Int): IntArray {
    val resArr = IntArray(2*n)
    var k = 0
    for (i in 0..(n-1)) {
        resArr[k++] = nums[i]
        resArr[k++] = nums[i+n]
    }
    return resArr
}