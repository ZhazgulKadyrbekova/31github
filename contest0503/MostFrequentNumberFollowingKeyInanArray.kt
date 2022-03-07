fun main() {
    println(mostFrequent(intArrayOf(1,100,200,1,100),1))
    println(mostFrequent(intArrayOf(2,2,2,2,3),2))
}

fun mostFrequent(nums: IntArray, key: Int): Int {
    val map = HashMap<Int, Int>()
    val size = nums.size - 2
    for (i in 0..size) {
        if (nums[i] == key) {
            val value = map[nums[i+1]]
            if (value == null)
                map[nums[i+1]] = 1
            else
                map[nums[i+1]] = value + 1
        }
//        println(map)
    }

    var max = 0
    var maxKey = 0
    for ((key, value ) in map) {
        if (value > max) {
            maxKey = key
            max = value
        }
    }
    return maxKey
}