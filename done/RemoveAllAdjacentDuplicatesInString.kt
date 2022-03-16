import java.util.*

fun main() {
    println(removeDuplicates("abbaca"))
    println(removeDuplicates("azxxzy"))
//    println(isValid("{[]}"))
}

fun removeDuplicates(s: String): String {
    val stack = Stack<Char>()
    for (i in s) {
//        println("$i\t$stack")
        if (stack.isNotEmpty() && stack.lastElement() == i) {
            stack.pop()
            continue
        }
        stack.push(i)
//        println("$stack\t----")
    }
    return stack.joinToString("")
}