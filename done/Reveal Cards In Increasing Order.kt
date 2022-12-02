import java.util.*

fun main() {
    val arr = deckRevealedIncreasing(intArrayOf(17,13,11,2,3,5,7))
    for (i in arr)
        println(i)
}

fun deckRevealedIncreasing(deck: IntArray): IntArray {
    deck.sortDescending()
    val size = deck.size; var k = 1
    val queue = ArrayDeque<Int>()
    queue.add(deck[0])

    while (k < size) {
        val last = queue.pollLast()
        queue.addFirst(last)
        queue.addFirst(deck[k++])
    }

    val arr = IntArray(size); k = 0
    for (i in queue) {
        arr[k++] = i
    }

    return arr
}
