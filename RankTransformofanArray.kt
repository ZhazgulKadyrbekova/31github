fun main() {
    val arr = arrayRankTransform(intArrayOf(40,10,20,30,20))
    for (i in arr)
        println(i)
}

fun arrayRankTransform(arr: IntArray): IntArray {
    val res = IntArray(arr.size) { 0 }
    var counter = 1

    while (res.contains(0)) {
//        println(res)
        val min = getMin(arr, res)
        if (min == Int.MAX_VALUE) continue
        setRank(arr, res, min, counter)
        counter++
    }
    return res
}

fun getMin(arr: IntArray, res: IntArray): Int {
    var min = Int.MAX_VALUE
    val index = arr.size - 1
    for (i in 0..index) {
        if (arr[i] < min && res[i] == 0) {
            min = arr[i]
        }
    }
    return min
}

fun setRank(arr: IntArray, res: IntArray, min: Int, counter: Int) {
    val index = arr.size - 1
    for (i in 0..index) {
        if (arr[i] == min) {
            res[i] = counter
        }
    }
}