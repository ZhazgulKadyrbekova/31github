fun main() {
//    println(slowestKey(intArrayOf(9,29,49,50), "cbcd"))
//    println(slowestKey(intArrayOf(23,34,43,59,62,80,83,92,97), "qgkzzihfc"))
    println(slowestKey(intArrayOf(1,2), "ba"))
}

fun slowestKey(releaseTimes: IntArray, keysPressed: String): Char {
    val size = releaseTimes.size - 1
    var prev = releaseTimes[0]
    var max = releaseTimes[0]
    var iMax = 0
    for (i in 1..size) {
        val duration = releaseTimes[i] - prev
        println("$prev\t${releaseTimes[i]}\t$max\t$iMax\t$duration\t${keysPressed[i]}")
        if (duration > max) {
            max = duration
            iMax = i
        }
        else if (duration == max) {
            if (keysPressed[i] > keysPressed[iMax])
                iMax = i
        }
        prev = releaseTimes[i]
    }
    return keysPressed[iMax]
}