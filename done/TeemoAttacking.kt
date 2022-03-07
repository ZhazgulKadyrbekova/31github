fun main() {
    println(findPoisonedDuration(intArrayOf(1,4), 2))
    println(findPoisonedDuration(intArrayOf(1,2), 2))
    println(findPoisonedDuration(intArrayOf(1,1), 2))
}

fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
    var count = 0
    val size = timeSeries.size - 1

    for (i in 0..size) {
        for (j in 0..(duration-1)) {
            if (i == size)
                count++
            else if (timeSeries[i] + j < timeSeries[i+1])
                count++
            else
                break
        }
    }
    return count
}