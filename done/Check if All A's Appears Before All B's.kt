fun main() {
    println(checkString("aaabbb"))
    println(checkString("abab"))
    println(checkString("bbb"))
}

fun checkString(s: String): Boolean {
    var metB = false
    for (i in s) {
        if (i == 'b') metB = true
        else if (metB) return false
    }
    return true
}