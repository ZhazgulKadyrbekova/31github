fun main() {
    println(findLHS(intArrayOf(1,3,2,2,5,2,3,7)))
    println(findLHS(intArrayOf(1,2,3,4)))
    println(findLHS(intArrayOf(1,1,1,1)))
    println(findLHS(intArrayOf(3,2,1)))
    println(findLHS(intArrayOf(1,4,1,3,1,-14,1,-13)))
}

fun findLHS(nums: IntArray): Int {
    val size = nums.size - 1
    val map = hashMapOf<Int, Int>()

    for (i in 0..size) {
        map[nums[i]] = map.getOrDefault(nums[i], 0) + 1
    }

    var max = 0
    for (key in map.keys) {
        if (map.containsKey(key+1)) {
            max = Math.max(max, map[key]!! + map[key+1]!!)
        }
    }
    return max
}