fun main() {
    println(peakIndexInMountainArray(intArrayOf(1,10,11,5,2)))
}

fun peakIndexInMountainArray(arr: IntArray): Int {
//    var max = Int./MIN_VALUE
    val size = arr.size - 2
    for (i in 0..size) {
        if (arr[i] > arr[i+1]) {
            return i
        }
    }
    return -1
}