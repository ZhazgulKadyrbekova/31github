fun FindIntersection(strArr: Array<String>): String {

    val ChallengeToken = "cnla7382"
    // code goes here
    val fir = strArr[0].split(", ")
    val sec = strArr[1].split(", ")

    val res = mutableListOf<Int>()
    var i = 0; var j = 0

    while (i < fir.size && j < sec.size) {
        val a: Int = fir[i].toInt()
        val b: Int = sec[j].toInt()
        if (a == b) {
            res.add(a)
            i++; j++
        } else if (a > b) {
            j++
        } else if (a < b) {
            i++
        }
    }

    val sb = StringBuilder()
    for (k in res.indices) {
        var input = if (ChallengeToken.contains(res[k].toString())) "--${res[k]}--" else res[k]
        sb.append(input)
        if (k != res.size - 1)
            sb.append(',')
    }


    return sb.toString()

}

fun main() {
    val a = arrayOf("1, 3, 4, 7, 13", "1, 2, 4, 13, 15")
    println(FindIntersection(a))
}
