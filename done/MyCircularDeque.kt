package done

import java.util.*

fun main() {
    val obj = MyCircularDeque(5)
    println(obj.insertFront(7))
    obj.printDeque()
    println(obj.insertLast(0))
    obj.printDeque()
    println(obj.getFront())
    obj.printDeque()
    println(obj.insertLast(3))
    obj.printDeque()
    println(obj.getFront())
    obj.printDeque()
    println(obj.insertFront(9))
    obj.printDeque()
    println(obj.getRear())
    obj.printDeque()
    println(obj.getFront())
    obj.printDeque()
    println(obj.getFront())
    obj.printDeque()
    println(obj.deleteLast())
    obj.printDeque()
    println(obj.getRear())
    obj.printDeque()
}

class MyCircularDeque(k: Int) {

    private val deque = LinkedList<Int>()
    private var size = 0
    private val maxSize = k

    fun insertFront(value: Int): Boolean {
        if (size >= maxSize) return false
        deque.addFirst(value)
        size++
        return true
    }

    fun insertLast(value: Int): Boolean {
        if (size >= maxSize) return false
        deque.add(value)
        size++
        return true
    }

    fun deleteFront(): Boolean {
        if (deque.isEmpty()) return false
        deque.poll()
        size--
        return true
    }

    fun deleteLast(): Boolean {
        if (deque.isEmpty()) return false
        deque.pollLast()
        size--
        return true
    }

    fun getFront(): Int {
        if (deque.isEmpty()) return -1
        return deque.first
    }

    fun getRear(): Int {
        if (deque.isEmpty()) return -1
        return deque.last
    }

    fun isEmpty(): Boolean {
        return deque.isEmpty()
    }

    fun isFull(): Boolean {
        return size == maxSize
    }

    fun printDeque() {
        println("$deque\t$size\t$maxSize")
    }
}