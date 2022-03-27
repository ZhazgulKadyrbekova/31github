import java.util.*

fun main() {
    println(timeRequiredToBuy(intArrayOf(2,3,2),2))
    println(timeRequiredToBuy(intArrayOf(5,1,1,1),0))
}

fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
    var count = 0
    val flag: Queue<Boolean> = LinkedList()
    val queue: Queue<Int> = LinkedList()
    for (i in tickets.indices) {
        queue.add(tickets[i])
        flag.add(i == k)
    }

    while (!queue.isEmpty()) {
//        println("$j\t$queue\t$count")
//        println("$j\t$flag")
        val value = flag.poll()
        val top = queue.poll() - 1
        count++

        if (top != 0) {
            queue.add(top)
            flag.add(value)
        } else if (value) {
            return count
        }
    }
    return 0
}