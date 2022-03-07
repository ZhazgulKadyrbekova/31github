fun main() {
    println(isValid("()[]{}"))
    println(isValid("([)]"))
    println(isValid("{[]}"))
}

//"([)]" - false
//"{[]}" - true

fun isValid(s: String): Boolean {
    val size = s.length - 1
    var brackets = 0
    var curly = 0
    var squared = 0
    var i = 0
    while (i <= size) {
//        println("$i\t${s[i]}")
        if (s[i] == '(') brackets++
        else if (s[i] == ')') brackets--
        else if (s[i] == '[') squared++
        else if (s[i] == ']') squared--
        else if (s[i] == '{') curly++
        else if (s[i] == '}') curly--
        if (brackets > 1 || squared > 1 || curly > 1) return false
        if (brackets + squared + curly >= 2) return false
        i++
    }
    if (brackets != 0 || squared != 0 || curly != 0) return false
    return true
}