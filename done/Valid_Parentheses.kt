import java.util.*

fun main() {
    println(isValid("()[]{}"))
    println(isValid("([)]"))
    println(isValid("{[]}"))
}

//"([)]" - false
//"{[]}" - true

fun isValid(s: String): Boolean {

    val openingBrackets = listOf('(', '{', '[')
    val closingForOpenings = hashMapOf<Char, Char>()
    closingForOpenings[')'] = '('
    closingForOpenings['}'] = '{'
    closingForOpenings[']'] = '['
    val stack = Stack<Char>()

    for (i in s) {
        println("$i\t")
        if (i in openingBrackets) {
            stack.push(i)
        }
        else {
            if (stack.isEmpty()) return false
            if (stack.lastElement() != closingForOpenings[i]) return false
            stack.pop()
        }
//        println()
    }
    println(stack)
    return stack.isEmpty()
}