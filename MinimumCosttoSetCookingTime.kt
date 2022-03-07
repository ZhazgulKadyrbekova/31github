//fun main() {
//    println(minimumDifference(intArrayOf(7,9,5,8,1,3)))
//}
//
//fun minimumDifference(nums: IntArray): Long {
//    val totalSize = nums.size
//    val size = totalSize/3
//    val minArr = IntArray(3)
//    for (i in 0..2) {
//        minArr[i] = getMinOfArr(nums, i*size, (i+1)*size)
//    }
//    return minArr.minOrNull()!!.toLong()
//}
//
//fun getMinOfArr(nums: IntArray, end: Int, start: Int): Int {
//
//}