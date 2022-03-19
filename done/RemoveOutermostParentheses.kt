import java.util.*

fun main() {
    println(removeOuterParentheses("(()())(())"))
    println(removeOuterParentheses("()()"))
}

fun removeOuterParentheses(s: String): String {
    val size = s.length - 1
    val brackets = Stack<Char>()
    var count = 0
    var i = 1

    while (i <= size) {
        val char = s[i]
        brackets.push(char)
        if (char == '(') count++
        else count--

        println("$i\t$char\t$count\t$brackets")

        if (count < 0) {
            brackets.pop()
            i++
            count = 0
        }
        i++
    }
    return brackets.joinToString("")
}