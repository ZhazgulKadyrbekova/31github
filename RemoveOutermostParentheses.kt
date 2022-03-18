import java.util.*

fun main() {
    println(removeOuterParentheses("(()())(())"))
}

fun removeOuterParentheses(s: String): String {
    val size = s.length - 1
    val brackets = Stack<Char>()
    var count = 0

    for (i in 0..size) {
        val char = s[i]
        brackets.push(char)
        if (char == '(') count++
        else count--

        if (count != 0) {
            brackets.pop()
            count++
        }
    }
    return brackets.joinToString()
}