fun main() {
//    val arr = threeSum(intArrayOf(-1,0,1,2,-1,-4))
    val arr = threeSum(intArrayOf(-1,0,1,2,-1,-4,-2,-3,3,0,4))
    println(arr)

    for (i in arr) {
        println("a\t$i")
    }
}

//i != j, i != k, and j != k
//nums[i] + nums[j] + nums[k] == 0
fun threeSum(nums: IntArray): List<List<Int>> {
    val arr: MutableList<List<Int>> = mutableListOf()
    val blocked: MutableList<Int> = mutableListOf()
    val size = nums.size - 1
    for (i in 0..size) {
        for (j in 0..size) {
            if (i == j) continue
            for (k in 0..size) {
                if (i == k || j == k) continue
                var count = 0
                if (blocked.contains(nums[i])) count++
                if (blocked.contains(nums[j])) count++
                if (blocked.contains(nums[k])) count++
                if (i != j && i != k && j != k &&
                    nums[i] + nums[j] + nums[k] == 0 && count != 3) {
                    arr.add(listOf(nums[i], nums[j], nums[k]))
                    blocked.add(nums[i])
                    blocked.add(nums[j])
                    blocked.add(nums[k])
                }
            }
        }
    }
    if (arr.isEmpty()) return emptyList()
    return arr
}