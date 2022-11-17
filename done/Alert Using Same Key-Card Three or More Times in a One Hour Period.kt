fun main() {
    println(
        alertNames(
            arrayOf("daniel","daniel","daniel","luis","luis","luis","luis"),
            arrayOf("11:20","10:40","11:00","09:00","11:00","13:00","15:00")
        )
    )
}

fun alertNames(keyName: Array<String>, keyTime: Array<String>): List<String> {
    val map = hashMapOf<String, MutableList<String>>()
    var i = 0
    while (i < keyName.size) {
        if (map[keyName[i]] == null)
            map[keyName[i]] = mutableListOf(keyTime[i])
        else
            map[keyName[i]]!!.add(keyTime[i])
        i++
    }

    val res = mutableListOf<String>()
    for (entry in map) {
        if (entry.value.size < 3)
            continue
        if (isWithinHour(entry.value))
            res.add(entry.key)
    }
    return res.sorted()
}
fun isWithinHour(list: List<String>): Boolean {
    val timeList = list.sorted()
    println(timeList)

//    [10:40, 11:00, 11:20]
//    [09:00, 11:00, 13:00, 15:00]
    var i = 0
    while (i + 2 < list.size) {
        if (difIsBiggerThanOne(timeList[i], timeList[i+2]))
            return true
        i++
    }
    return false
}
fun difIsBiggerThanOne(txt1: String, txt2: String): Boolean {
    val fir = txt1.split(":")
    val sec = txt2.split(":")
    if (fir[0] == sec[0]) {
        if (sec[1].toInt() - fir[1].toInt() <= 60)
            return true
    } else {
        if ((sec[0].toInt() - fir[0].toInt()) * 60 + sec[1].toInt() - fir[1].toInt() <= 60)
            return true
    }
    return false
}