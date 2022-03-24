import java.util.*

fun main() {
    println(calPoints(arrayOf("5","2","C","D","+")))
    println(calPoints(arrayOf("5","-2","4","C","D","9","+","+")))
    println(calPoints(arrayOf("5")))
}

fun calPoints(ops: Array<String>): Int {
    val stack = Stack<Int>()
    for (i in ops) {
        when (i) {
            "+" -> {
                val fir = stack.pop()
                val sec = stack.pop()
                val res = fir + sec
                stack.push(sec)
                stack.push(fir)
                stack.push(res)
            }
            "D" -> {
                val last = stack.pop()
                val res = last * 2
                stack.push(last)
                stack.push(res)
            }
            "C" -> {
                stack.pop()
            }
            else -> {       //numbers - scores
                stack.push(i.toInt())
            }
        }
    }
    var sum = 0
    while (!stack.isEmpty())
        sum += stack.pop()
    return sum
}