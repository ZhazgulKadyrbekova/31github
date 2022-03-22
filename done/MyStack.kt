import java.util.*

fun main() {
    val obj = MyStack()
    obj.push(1)
    obj.push(2)
    println(obj.queue)
    println(obj.top())
    println(obj.pop())
    println(obj.empty())
}

class MyStack() {

    val queue = LinkedList<Int>()
    fun push(x: Int) {
        val temp = LinkedList<Int>()

        while (queue.isNotEmpty())
            temp.push(queue.pop())

        temp.push(x)

        while (temp.isNotEmpty())
            queue.push(temp.pop())
    }

    fun pop(): Int {
        return queue.removeLast()
    }

    fun top(): Int {
        return queue.last
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }

}
