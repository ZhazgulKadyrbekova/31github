package done

import java.util.*

fun main() {
    val obj = MyCircularQueue(3)
    println(obj.enQueue(1))
    obj.printQueue()
    println(obj.enQueue(2))
    obj.printQueue()
    println(obj.enQueue(3))
    obj.printQueue()
    println(obj.enQueue(4))
    obj.printQueue()
    println(obj.Rear())
    obj.printQueue()
    println(obj.isFull())
    obj.printQueue()
    println(obj.deQueue())
    obj.printQueue()
    println(obj.enQueue(4))
    obj.printQueue()
    println(obj.Rear())
    obj.printQueue()
}

class MyCircularQueue(k: Int) {

    private val queue = LinkedList<Int>()
    private var size = 0
    private val maxSize = k

    fun enQueue(value: Int): Boolean {
        if (size >= maxSize) return false
        queue.add(value)
        size++
        return true
    }

    fun deQueue(): Boolean {
        if (queue.isEmpty()) return false
        queue.pop()
        size--
        return true
    }

    fun Front(): Int {
        if (queue.isEmpty()) return -1
        return queue.first
    }

    fun Rear(): Int {
        if (queue.isEmpty()) return -1
        return queue.last
    }

    fun isEmpty(): Boolean {
        return queue.isEmpty()
    }

    fun isFull(): Boolean {
        return size == maxSize
    }

    fun printQueue() {
        println("$queue\t$size\t$maxSize")
    }

}