fun main() {
    val arr = intArrayOf(3,4,9,1,3,9,5)
//    val arr = intArrayOf(2,2,2,2,2)
    val res = findKDistantIndices(arr,9,1)
    println()
    for (i in res)
        println(i)
}

fun findKDistantIndices(nums: IntArray, key: Int, k: Int): List<Int> {
    val res = mutableListOf<Int>()
    val same = mutableListOf<Int>()
    for (i in nums.indices) {
        if (nums[i] == key) same.add(i)
    }

    println("same\t$same")
    for (i in nums.indices) {
        for (j in 0 until same.size) {
            if (Math.abs(same[j] - i) <= k) {
                println("i: $i\tj: $j\tsame[j] - i: ${same[j] - i}")
                res.add(i)
                break
            }
        }
    }
    return res
}
