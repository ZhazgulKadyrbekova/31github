import java.util.*

fun main() {
    println(evalRPN(arrayOf("2","1","+","3","*")))
    println(evalRPN(arrayOf("4","13","5","/","+")))
    println(evalRPN(arrayOf("10","6","9","3","+","-11","*","/","*","17","+","5","+")))
}

fun evalRPN(tokens: Array<String>): Int {
    val stack = Stack<String>()
    for (i in tokens) {
        when (i) {
            "+", "-", "*", "/" -> {
                val nmb2 = stack.pop()
                val nmb1 = stack.pop()
                val res = processOperation(nmb1, nmb2, i)
                stack.push(res)
            }
            else -> stack.push(i)
        }
    }
    println(stack)
    return stack.pop().toInt()
}

fun processOperation(nmb1: String, nmb2: String, sign: String): String {
    val a = nmb1.toInt()
    val b = nmb2.toInt()
    var res = 0
    when (sign) {
        "+" -> {
            res = a + b
        }
        "-" -> {
            res = a - b
        }
        "*" -> {
            res = a * b
        }
        "/" -> {
            res = a / b
        }
    }
    return res.toString()
}
