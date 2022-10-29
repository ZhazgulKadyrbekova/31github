fun main() {
//    println(minAddToMakeValid("())"))
//    println(minAddToMakeValid("((("))
    println(minAddToMakeValid("()))(("))
}

fun minAddToMakeValid(s: String): Int {
    var opened = 0; var res = 0
    for (i in s) {
        if (i == '(') opened++
        else opened--
        if (opened < 0) {
            res += 1
            opened = 0
        }
    }
    return res + opened
}