import java.util.*

fun main() {
    val j = readLine()!!
    val s = readLine()!!

    var result = 0
    for (c in s) {
        if (j.contains(c)) {
            result += 1;
        }
    }

    println(result)
}

fun main1() {
    val scanner = Scanner(System.`in`)
    val j = scanner.nextLine()
    val s = scanner.nextLine()
    println(find(j,s))
}

fun find(j: String, s: String): Int {
    var count = 0
    for (i in s) {
        if (j.contains(i)) count++
    }
    return count
}

