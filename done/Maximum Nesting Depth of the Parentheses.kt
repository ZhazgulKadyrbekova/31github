fun main() {
    println(maxDepth("(1+(2*3)+((8)/4))+1"))
}

fun maxDepth(s: String): Int {
    var max = 0
    var current = 0
    for (i in s) {
        if (i == '(')
            current++
        if (i == ')') {
            if (current > max) max = current
            current--
        }
    }
    return max
}