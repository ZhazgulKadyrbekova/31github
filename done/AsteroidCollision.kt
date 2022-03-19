import java.util.*

fun main() {
    val arr = asteroidCollision(intArrayOf(-5,5,10,-5))
//    val arr = asteroidCollision(intArrayOf(5,10,-5))
//    val arr = asteroidCollision(intArrayOf(8,-8))
//    val arr = asteroidCollision(intArrayOf(10,2,-5))
    for (i in arr)
        println(i)
}

fun asteroidCollision(asteroids: IntArray): IntArray {
    val stack = Stack<Int>()

    for (i in asteroids) {
        while (stack.isNotEmpty() && stack.lastElement() > 0 && stack.lastElement() < -i)
            stack.pop()

        if (stack.isEmpty() || i > 0 || stack.lastElement() < 0)
            stack.push(i)
        else if (i < 0 && stack.lastElement() == -i)
            stack.pop()
    }

    return stack.toIntArray()
}

