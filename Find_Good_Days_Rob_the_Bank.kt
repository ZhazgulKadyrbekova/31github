fun main() {
//    val arr = intArrayOf(5,3,3,3,5,6,2)
    val arr = intArrayOf(4,3,2,1)
    println(goodDaysToRobBank(arr, 1))
}

/*
security = [5,3,3,3,5,6,2], time = 2
Output: [2,3]
 */

fun goodDaysToRobBank(security: IntArray, time: Int): List<Int> {
    val res = mutableListOf<Int>()
    val size = security.size - time - 1
    for (i in time..size) {
//        println("$i\t${i-time}\t${i+time}")
//        println("${security[i]}\t${security[i-time]}\t${security[i+time]}")
//        println()
        if (isAscending(i-time,i, i+time, security)) {
//            println("yes")
            res.add(i)
        }
    }

    return res
}

fun isAscending(left: Int, mid: Int, right: Int, arr: IntArray): Boolean {
//    println()
    for (i in left..(right-1)) {
//        println("$i\t$mid\t\t${arr[i]}\t${arr[i+1]}")
        if (i == mid && (!(arr[i-1] >= arr[i]) || !(arr[i] <= arr[i+1])))
            return false
        if (i < mid && !(arr[i] >= arr[i+1])) {
            return false
        }
        if (i > mid && !(arr[i] <= arr[i+1]))
            return false
    }
    return true
}