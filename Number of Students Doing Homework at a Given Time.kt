fun main() {
//    val arr = arrayOf(intArrayOf(1,1), intArrayOf(3,4), intArrayOf(-1,0))
    val arr1 = intArrayOf(4)
    val arr2 = intArrayOf(4)
    println(busyStudent(arr1, arr2, 4))
}

fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
    val size = startTime.size - 1
    var count = 0
    for (i in 0..size) {
        if (startTime[i] <= queryTime && endTime[i] >= queryTime) count++
    }
    return count
}