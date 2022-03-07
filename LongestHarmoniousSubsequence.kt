fun main() {
    println(findLHS(intArrayOf(1,3,2,2,5,2,3,7)))
//    println(findLHS(intArrayOf(1,2,3,4)))
//    println(findLHS(intArrayOf(1,1,1,1)))
}

fun findLHS(nums: IntArray): Int {
    nums.sort()
    val resList = listOf<Int>()
    var counter = 0
    var fir = nums[0]
    val difCounted = false
    val index = nums.size - 1
    for (i in 0..index) {
        println("$i\t${nums[i]}\t")
        if (fir == nums[i]) continue
        for (j in (i+1)..index) {
            if (nums[j] - fir <= 1) counter++
            else {
                break
            }
        }
        println("counter:\t$counter")
    }

    return counter
}