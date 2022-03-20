fun main() {
//    val arr = dailyTemperatures(intArrayOf(73,74,75,71,69,72,76,73))
//    val arr = dailyTemperatures(intArrayOf(30,40,50,60))
    val arr = dailyTemperatures(intArrayOf(30,60,9))
    for (i in arr)
        print("$i\t")
    println()
}

fun dailyTemperatures(temperatures: IntArray): IntArray {
    var size = temperatures.size
    val resList = IntArray(size)
    size -= 1

    for (i in 0..size) {
        val cur = temperatures[i]
        var value = 0
        var count = 1
        for (j in (i+1)..size) {
            if (temperatures[j] > cur) {
                value = count
                break
            }
            else count++
        }
        resList[i] = value
    }
    return resList
}