fun main() {
    println(numberOfRounds("09:31", "10:14"))
    println(numberOfRounds("00:01", "00:00"))
    println(numberOfRounds("18:51", "04:54"))
}

fun numberOfRounds(loginTime: String, logoutTime: String): Int {
    var txt = loginTime.split(":")
    val h1 = txt[0].toInt()
    val m1 = txt[1].toInt()
    txt = logoutTime.split(":")
    var h2 = txt[0].toInt()
    val m2 = txt[1].toInt()

    if ((h2 == h1 && m2 < m1) || (h2 < h1)) h2 += 24

    val mins = (60 - m1) / 15 + m2 / 15
    val hours = h2 - h1 - 1

    val res = hours * 4 + mins
    return if (res < 0) 0 else res
}