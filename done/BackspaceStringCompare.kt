import java.util.*

fun main() {
//    println(backspaceCompare("ab#c", "ad#c"))
//    println(backspaceCompare("a##b", "#a#c"))
    println(backspaceCompare("y#fo##f", "y#f#o##f"))
}

fun backspaceCompare(s: String, t: String): Boolean {
    val size = if (s.length > t.length) s.length else t.length
    val stack1 = Stack<Char>()
    val stack2 = Stack<Char>()
    for (i in 0..size) {
        if (i < s.length) {
            if (s[i] == '#' && stack1.isNotEmpty())
                stack1.pop()
            else if (s[i] != '#')
                stack1.push(s[i])
        }
        if (i < t.length) {
            if (t[i] == '#' && stack2.isNotEmpty())
                stack2.pop()
            else if (t[i] != '#')
                stack2.push(t[i])
        }
    }
    println(stack1)
    println(stack2)
    return (stack1 == stack2)
}