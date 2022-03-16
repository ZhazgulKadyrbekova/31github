package done

fun main() {
    val obj = MinStack()
//    ["MinStack","push","push","push","getMin","pop","top","getMin"]
//    [[],[-2],[0],[-3],[],[],[],[]]
    println(obj.push(-2))
    println(obj.push(0))
    println(obj.push(-3))
    println(obj.getMin())
    println(obj.pop())
    println(obj.top())
    println(obj.getMin())
//    [null,null,null,null,-3,null,0,-2]
}

class MinStack() {

    private val elements = mutableListOf<Int>()
    private var size = elements.size

    fun push(`val`: Int) {
        elements.add(`val`)
        size++
    }

    fun pop() {
        elements.removeAt(size-1)
        size--
    }

    fun top(): Int {
        return elements[size-1]
    }

    fun getMin(): Int {
        var min = Int.MAX_VALUE
        for (i in elements) {
            if (i < min) min = i
        }
        return min
    }

}