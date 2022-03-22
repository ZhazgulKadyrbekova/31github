import java.util.*

fun main() {
    val obj = MyQueue()
    obj.push(1)
    obj.push(2)
    println(obj.peek())
    println(obj.pop())
    println(obj.empty())
}

class MyQueue() {
    private val stack = Stack<Int>()

    fun push(x: Int) {
        val temp = Stack<Int>()

        while (stack.isNotEmpty())
            temp.push(stack.pop())

        stack.push(x)

        while (temp.isNotEmpty())
            stack.push(temp.pop())
    }

    fun pop(): Int {
        return stack.pop()
    }

    fun peek(): Int {
        return stack.peek()
    }

    fun empty(): Boolean {
        return stack.isEmpty()
    }

}