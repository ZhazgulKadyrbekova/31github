fun main() {
    println(countDaysTogether("08-15", "08-18", "08-16", "08-19"))
}

fun countDaysTogether(arriveAlice: String, leaveAlice: String, arriveBob: String, leaveBob: String): Int {
    val arriveAliceArr = arriveAlice.split("-")
    val arriveBobArr = arriveBob.split("-")
    val startMonth: Int
    val startDay: Int
    if (arriveAliceArr[0].toInt() > arriveBobArr[0].toInt()) {
        startMonth = arriveAliceArr[0].toInt()
        startDay = arriveAliceArr[1].toInt()
    }
    else if (arriveBobArr[0].toInt() > arriveAliceArr[0].toInt()) {
        startMonth = arriveBobArr[0].toInt()
        startDay = arriveBobArr[1].toInt()
    }
    else if (arriveAliceArr[1].toInt() > arriveBobArr[1].toInt()){
        startMonth = arriveAliceArr[0].toInt()
        startDay = arriveAliceArr[1].toInt()
    }
    else {
        startMonth = arriveBobArr[0].toInt()
        startDay = arriveBobArr[1].toInt()
    }

    val leaveAliceArr = leaveAlice.split("-")
    val leaveBobArr = leaveBob.split("-")
    val endMonth: Int
    val endDay: Int
    if (leaveAliceArr[0].toInt() < leaveBobArr[0].toInt()) {
        endMonth = leaveAliceArr[0].toInt()
        endDay = leaveAliceArr[1].toInt()
    }
    else if (leaveBobArr[0].toInt() < leaveAliceArr[0].toInt()) {
        endMonth = leaveBobArr[0].toInt()
        endDay = leaveBobArr[1].toInt()
    }
    else if (leaveAliceArr[1].toInt() < leaveBobArr[1].toInt()){
        endMonth = leaveAliceArr[0].toInt()
        endDay = leaveAliceArr[1].toInt()
    }
    else {
        endMonth = leaveBobArr[0].toInt()
        endDay = leaveBobArr[1].toInt()
    }

    //18.06 - 10.08

    println()
    println("$startMonth\t$startDay")
    println("$endMonth\t$endDay")
    println()

    if (startMonth > endMonth) {
        return 0
    }
    if (startMonth == endMonth) {
        if (startDay > endDay) {
            return 0
        }
        return endDay - startDay + 1
    }

    val months = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    var count = 0
    var i = startMonth
    while (i <= endMonth) {
        count += when (i) {
            startMonth -> {
                months[i-1] - startDay
            }
            endMonth -> {
                endDay
            }
            else -> {
                months[i-1]
            }
        }
        i++
    }
    return count
}
