//fun main() {
//    val arr = merge(arrayOf(intArrayOf(1,3), intArrayOf(2,6), intArrayOf(8,10), intArrayOf(15,18)))
//    for (i in arr)
//        for (j in i)
//            println(j)
//}
//
//fun merge(intervals: Array<IntArray>): Array<IntArray> {
//    val res = Array<IntArray>(intervals.size)
////    arrayOf(intervals[0])
//    var k = 1
//    val size = intervals.size - 1
//    for (i in 1..size) {
//        val resSize = res.size - 1
//        for (j in 0..resSize) {
//            if (res[j][0] > intervals[i][0]) {
//                res[j][0] = intervals[i][0]
//            }
//            if (res[j][1] < intervals[i][0]) {
//                res[j][1] = intervals[i][1]
//                continue
//            }
//            res[k++] = intervals[i]
//            break
//        }
//    }
//    return res
//}
