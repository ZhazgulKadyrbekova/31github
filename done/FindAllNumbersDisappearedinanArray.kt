fun main() {
    val arr = findDisappearedNumbers(intArrayOf(4,3,2,7,8,2,3,1))
    for (i in arr)
        println(i)
}

fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val resArr = mutableListOf<Int>()
    val size = nums.size
    for (i in 1..size) {
        if (!nums.contains(i)) resArr.add(i)
    }
    return resArr
}