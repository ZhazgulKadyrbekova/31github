fun main() {
//    println(makeFancyString("leeetcode"))
//    println(makeFancyString("aaabaaaa"))
    println(makeFancyString("aab"))
}

fun makeFancyString(s: String): String {
    var prev = '0'
    var prevCount = 0
    val stringBuilder = StringBuilder()
    println("i\tprev\tprevCount")
    for (i in s) {
        println("----------------------------------------------------")
        println("$i\t$prev\t\t$prevCount")
        if (prev == i && prevCount < 2) {
            stringBuilder.append(i)
            prevCount++
        }
        else if (prev == i) {
            prevCount++
        }
        else {
            stringBuilder.append(i)
            prev = i
            prevCount = 1
        }
        println("$i\t$prev\t\t$prevCount")
    }
    return stringBuilder.toString()
}
