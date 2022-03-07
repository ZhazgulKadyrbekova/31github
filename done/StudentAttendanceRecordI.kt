fun main() {
    println(checkRecord("PPALLP"))
    println(checkRecord("PPALLL"))
}

fun checkRecord(s: String): Boolean {
    val index = s.length - 1
    var absentCount = 0
    var lateCount = 0
    var max = 0

    for (i in 0..index) {
        when (s[i]) {
            'A' -> {
                absentCount++
                if (lateCount > max) max = lateCount
                lateCount = 0
            }
            'L' -> lateCount++
            'P' -> {
                if (lateCount > max) max = lateCount
                lateCount = 0
            }
        }
    }
    if (lateCount > max) max = lateCount
    return (absentCount < 2 && max < 3)
}