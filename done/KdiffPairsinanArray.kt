fun main() {
//    println(findPairs(intArrayOf(3,1,4,1,5), 2))
    println(findPairs(intArrayOf(1,2,3,4,5), 1))
//    println(findPairs(intArrayOf(0,1,3,1,1,5,4), 0))
}

fun findPairs(nums: IntArray, k: Int): Int {
    val arr = nums.sorted()
    val size = arr.size - 1
    var count = 0
    var prev1: Int? = null

    for (i in 0..size) {
        println("$i\t${arr[i]}\t$prev1\t$count")
        if (prev1 != null && arr[i] == prev1) continue
        var prev2: Int? = null
        for (j in (i+1)..size) {
            println("$j\t${arr[j]}\t$prev2")
            if (prev2 != null && arr[j] == prev2) continue
            if (arr[j] - arr[i] == k) count++
            else if (arr[j] - arr[i] > k) break
            prev2 = arr[j]
        }
        prev1 = arr[i]
    }
    return count
}